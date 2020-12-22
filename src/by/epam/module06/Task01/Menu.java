package by.epam.module06.Task01;

import java.util.Scanner;

import by.epam.module06.Task01.Entity.Status;
import by.epam.module06.Task01.Entity.User;
import by.epam.module06.Task01.Logic.LibraryLogic;
import by.epam.module06.Task01.Logic.UserDatabaseLogic;

public class Menu {
	
	
	 private static int getInt(int min, int max) {
		 @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		 String choice = in.nextLine();
	        try {
	            int res =  Integer.parseInt(choice);
	            if (res < min || res > max) {
	                throw new NumberFormatException("Invalid number");
	            }
	            return res;
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input: try again");
	            return getInt(min, max);
	        }
	    }

	public static void login() throws Exception {

		System.out.println("Please, enter your username:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String login = sc.nextLine();
		System.out.println("Enter your password:");
		String password = sc.nextLine();
		User currentUser = UserDatabaseLogic.validation(login, password);
		if (currentUser.getUsername() != null) {
			System.out.println("Welcome, " + currentUser.getUsername()); // недописал
			if (currentUser.getStatus() == Status.ADMINISTRATOR) {
				administratorMenu();
			} else {
				standardMenu(currentUser);
			}
		} else {
			System.out.println("Wrong password or username, try again");
			login();
		}
	}

	private static void administratorMenu() throws Exception {
		
		System.out.println("Send \"1\" to view the list of books;\n"
							+ "Send \"2\" to modify the library;\n"
							+ "Send \"3\" to close the application.");
		int mode = getInt(1, 3);
		switch (mode) {
		case 1:
			LibraryLogic.libraryViewer(0);
			administratorMenu();
			break;
		case 2: {
			System.out.println("Send \"1\" to remove a book from the library;\n"
								+ "Send \"2\" to add a book to the library;\n"
								+ "Send \"3\" to edit the information of the selected book;\n"
								+ "Send \"0\" to return to main menu;");
			int editMode = getInt(0, 3);
			switch (editMode) {
			case 0:
				administratorMenu();
				break;
			case 1:
				LibraryLogic.removeBook();
				administratorMenu();
				break;
			case 2:
				LibraryLogic.addBook();
				administratorMenu();
				break;
			case 3:
				LibraryLogic.editBook();
				administratorMenu();
			}
		}
		case 3:
			exit();
		}
	}

	private static void standardMenu(User user) throws Exception {

		System.out.println("Send \"1\" to view the list of books;\n"
							+ "Send \"2\" to go to book search;\n"
							+ "Send \"3\" to close the application.");
		int mode = getInt(1, 3);
		switch (mode) {
		case 1:
			LibraryLogic.libraryViewer(0);
			standardMenu(user);
		case 2:
			LibraryLogic.bookFinder();
			standardMenu(user);
			break;
		case 3:
			exit();
		}
	}
	
	private static void exit() {
		System.out.println("Goodbye!");
		System.exit(0);	
	}
}
