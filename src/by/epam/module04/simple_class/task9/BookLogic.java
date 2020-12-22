package by.epam.module04.simple_class.task9;

import java.util.Scanner;

public class BookLogic {

	public static void viewBooksBySelectedAuthor(Book[] books) {

		System.out.println("Введите фамилию и имя автора книги >>");

		String keyword = keyboardInput();

		boolean noResults = true;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().equals(keyword)) {
				System.out.println(books[i].toString());
				noResults = false;
			}
		}
		if (noResults)
			System.out.println("Нет результатов по данному запросу");
	}

	public static void viewBooksBySelectedPublisher(Book[] books) {

		System.out.println("\nВведите название издательства >>");

		String keyword = keyboardInput();

		boolean noResults = true;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublisher().equals(keyword)) {
				System.out.println(books[i].toString());
				noResults = false;
			}
		}
		if (noResults)
			System.out.println("Нет результатов по данному запросу");
	}

	public static void viewBooksAfterTheSelectedYear(Book[] books) {

		System.out.println("\nВведите год >>");

		String keyword = keyboardInput();
		int year = Integer.parseInt(keyword);

		boolean noResults = true;

		for (int i = 0; i < books.length; i++) {
			if (books[i].getYear() > year) {
				System.out.println(books[i].toString());
				noResults = false;
			}
		}
		if (noResults)
			System.out.println("Нет результатов по данному запросу");
	}

	public static String keyboardInput() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine();
		return keyword;
	}
}
