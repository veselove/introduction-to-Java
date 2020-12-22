package by.epam.module06.Task02;

import java.util.Scanner;

import by.epam.module06.Task02.Logic.NoteCreator;
import by.epam.module06.Task02.Logic.NotesFinder;
import by.epam.module06.Task02.Logic.NotesSorter;
import by.epam.module06.Task02.Logic.View;

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

	public static void mainMenu() throws Exception {
		
		System.out.println("Send \"1\" to view a list of notes;\n"
				+ "Send \"2\" to create a new note;\n"
				+ "Send \"3\" to search for a note;\n"
				+ "Send \"4\" to sort notes;\n"
				+ "Send \"0\" to exit the application;");
		
		int mode = getInt(0, 4);
		switch (mode) {
		case 1:
			View.viewAllNotes();
			mainMenu();
			break;
		case 2:
			NoteCreator.createNewNote();
			mainMenu();
			break;
		case 3:
			NotesFinder.findNote();
			mainMenu();
			break;
		case 4:
			sorterMenu();
			break;
		case 0:
			exit();
		}
		
	}
	
	public static void sorterMenu() throws Exception {
		
		System.out.println("Send \"1\" to sort notes by creation date by ascending;\n"
				+ "Send \"2\" to sort notes by creation date by descending;\n"
				+ "Send \"3\" to sort notes by topic;\n"
				+ "Send \"4\" to sort notes by email;\n"
				+ "Send \"0\" to go to the main menu;");
		
		int mode = getInt(0, 4);
		switch (mode) {
		case 1:
			NotesSorter.sortByDateByAscending();
			mainMenu();
			break;
		case 2:
			NotesSorter.sortByDateByDescending();
			mainMenu();
			break;
		case 3:
			NotesSorter.sortByTopic();
			mainMenu();
			break;
		case 4:
			NotesSorter.sortByEmail();
			mainMenu();
			break;
		case 0:
			mainMenu();
			break;
		}
		
	}
	
	private static void exit() {
		System.out.println("Goodbye!");
		System.exit(0);	
	}
	
}
