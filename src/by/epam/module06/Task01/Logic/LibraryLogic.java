package by.epam.module06.Task01.Logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.module06.Task01.Entity.Book;
import by.epam.module06.Task01.Entity.BookFormat;

public class LibraryLogic {

	private static int getInt(int min, int max) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		try {
			int res = Integer.parseInt(choice);
			if (res < min || res > max) {
				throw new NumberFormatException("Invalid number");
			}
			return res;
		} catch (NumberFormatException e) {
			System.out.println("Invalid input: try again");
			return getInt(min, max);
		}
	}

	public static String getString() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		return string;
	}

	public static void ExportLibraryToTXT(ArrayList<Book> catalog) {
		try {

			File file = new File("src\\by\\epam\\module06\\Task01\\Library.txt");

			if (!file.exists()) {
				file.createNewFile();
			} else {

			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < catalog.size(); i++) {

				StringBuilder builder = new StringBuilder();
				builder.append(catalog.get(i).getTitle() + "#%");
				builder.append(catalog.get(i).getAuthor() + "#%");
				builder.append(catalog.get(i).getPublisher() + "#%");
				builder.append(catalog.get(i).getDescription() + "#%");
				builder.append(catalog.get(i).getYearOfPublication() + "#%");
				builder.append(catalog.get(i).getBookFormat());
				builder.append("\n");
				String book = builder.toString();
				bw.write(book);

			}
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Book> ImportLibraryFromTXT() throws Exception {

		ArrayList<Book> books = new ArrayList<Book>();
		File file = new File("src\\by\\epam\\module06\\Task01\\Library.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String temp = sc.nextLine();
			Book book = new Book();
			Scanner sc2 = new Scanner(temp).useDelimiter("#%");
			book.setTitle(sc2.next());
			book.setAuthor(sc2.next());
			book.setPublisher(sc2.next());
			book.setDescription(sc2.next());
			book.setYearOfPublication(sc2.nextInt());
			book.setBookFormat(sc2.next());
			books.add(book);
			sc2.close();
		}

		return books;
	}

	public static void libraryViewer(int startIndex) throws Exception {
		
		if (startIndex < 0) {
			startIndex = 0;
		}

		ArrayList<Book> books = ImportLibraryFromTXT();

		System.out.println("*** Page " + ((startIndex / 5) + 1) + " ***");

		int stopIndex = startIndex + 5;

		if (stopIndex > books.size()) {
			stopIndex = books.size();
		}

		for (int i = startIndex; i < stopIndex; i++) {
			System.out.println(i + 1 + ". " + books.get(i));
		}
		System.out.println("***\nTo open next page send \"n\". " + "To open previous page send \"p\". "
				+ "To return to the main menu send \"r\".");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNext("[npr]")) {
			System.out.println("wrong choice, try again >>");
			sc.next();
		}
		String mode = sc.next();
		switch (mode) {
		case "n":
			LibraryLogic.libraryViewer(startIndex + 5);
			break;
		case "p":
			LibraryLogic.libraryViewer(startIndex - 5);
			break;
		case "r":
			;
			break;
		}

	}

	public static void bookFinder() throws Exception {

		System.out.println("Enter the title of the book");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String keyWords = sc.nextLine();

		ArrayList<Book> books = ImportLibraryFromTXT();

		Pattern pattern = Pattern.compile(keyWords);

		boolean noResults = true;

		System.out.println("Searching results:");

		for (int i = 0; i < books.size(); i++) {

			Matcher matcher = pattern.matcher(books.get(i).getTitle());

			if (matcher.find()) {
				System.out.println(books.get(i));
				noResults = false;
			}
		}

		if (noResults) {
			System.out.println("---no search results---");
		}

		System.out.println("***\nTo make a new search send \"n\". " + "To return to the main menu send \"r\".");

		while (!sc.hasNext("[nr]")) {
			System.out.println("wrong choice, try again >>");
			sc.next();
		}
		String mode = sc.next();
		switch (mode) {
		case "n":
			bookFinder();
			break;
		case "r":
			;
			break;

		}
	}

	public static void removeBook() throws Exception {

		ArrayList<Book> books = ImportLibraryFromTXT();

		System.out.println("Attention! After entering the book number, it will be deleted automatically!\n"
				+ "Enter the number of the book you want to remove");
		int bookNumber = getInt(1, books.size());
		bookNumber--;
		books.remove(bookNumber);
		ExportLibraryToTXT(books);
		System.out.println("done!");
	}

	public static void addBook() throws Exception {

		Book newBook = new Book();

		System.out.println("Enter the title of the new book");
		newBook.setTitle(getString());

		System.out.println("Enter the author of the new book");
		newBook.setAuthor(getString());

		System.out.println("Enter the publisher of the new book");
		newBook.setPublisher(getString());

		System.out.println("Enter the description of the new book");
		newBook.setDescription(getString());

		System.out.println("Enter the year of the new book");
		newBook.setYearOfPublication(getInt(1700, 2020));

		System.out.println("The book format of the new book.\n" + "Press \"1\" to select paper version;\n"
				+ "Press \"2\" to select digital version.");
		int choice = getInt(1, 2);
		if (choice == 1) {
			newBook.setBookFormat(BookFormat.PRINTED);
		} else if (choice == 2) {
			newBook.setBookFormat(BookFormat.DIGITAL);
		}

		ArrayList<Book> books = ImportLibraryFromTXT();

		books.add(newBook);

		ExportLibraryToTXT(books);

		System.out.println("Done! Book added.");

	}

	public static void editBook() throws Exception {

		ArrayList<Book> books = ImportLibraryFromTXT();

		System.out.println("*** Book information editing mode ***");
		System.out.println("Enter the number of the book you want to edit");
		int bookNumber = getInt(1, books.size());
		
		bookNumber--;

		System.out.println(books.get(bookNumber));

		int choice = 0;

		do {
			System.out.println("Send \"1\" to edit title;\n" 
							+ "Send \"2\" to edit author information;\n"		
							+ "Send \"3\" to edit publisher information;\n" 
							+ "Send \"4\" to edit description;\n"		
							+ "Send \"5\" to edit year of publication;\n" 
							+ "Send \"6\" to edit media type of book;\n"
							+ "Send \"0\" to return to the main menu.");

			choice = getInt(0, 6);

			switch (choice) {
			case 1:
				System.out.println("Enter a new title of book");
				books.get(bookNumber).setTitle(getString());
				break;
			case 2:
				System.out.println("Enter new information about author");
				books.get(bookNumber).setAuthor(getString());
				break;
			case 3:
				System.out.println("Enter new information about publisher");
				books.get(bookNumber).setPublisher(getString());
				break;
			case 4:
				System.out.println("Enter new description of book");
				books.get(bookNumber).setDescription(getString());
				break;
			case 5:
				System.out.println("Enter new year of publication");
				books.get(bookNumber).setYearOfPublication(getInt(1700, 2020));
				break;
			case 6:
				System.out.println("The book format selection:\n" + "Press \"1\" to select paper version;\n"
						+ "Press \"2\" to select digital version.");
				int mediaType = getInt(1, 2);
				if (mediaType == 1) {
					books.get(bookNumber).setBookFormat(BookFormat.PRINTED);
				} 
				else if (mediaType == 2) {
					books.get(bookNumber).setBookFormat(BookFormat.DIGITAL);
				}
				break;
			}
			System.out.println("*** Changes saved ***");
			ExportLibraryToTXT(books);

		} while (choice != 0);

	}

}
