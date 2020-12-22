package by.epam.module04.simple_class.task8;

import java.util.Scanner;

public class CustomerLogic {

	public static void viewCustomer(Customer customers) {
		System.out.println("id " + customers.getID() + " " + customers.getSurname() + " " + customers.getName() + " "
				+ customers.getPatronymic() + ", " + customers.getAddress() + ", № карты: " + customers.getCardNumber()
				+ ", номер счета: " + customers.getBankAccountNumber());
	}

	public static void abcSortingSurnames(Customer[] customers) {
		for (int i = 0; i < customers.length; i++) {
			for (int j = 1; j < customers.length; j++) {
				if (customers[j - 1].getSurname().compareTo(customers[j].getSurname()) > 0) {
					swap(customers, j - 1, j);
				}
			}
		}
		for (int i = 0; i < customers.length; i++) {
			CustomerLogic.viewCustomer(customers[i]);
		}
	}

	public static void swap(Customer[] customers, int a, int b) {
		Customer temp = customers[a];
		customers[a] = customers[b];
		customers[b] = temp;
	}

	public static void viewCustomersFromCardRange(Customer[] customers) {

		System.out.println("\nВведите начало интервала >>");
		String start = "0";
		start = rangeInput(start);

		System.out.println("Введите конец интервала >>");
		String end = "0";
		end = rangeInput(end);

		boolean noResults = true;

		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getCardNumber().compareTo(start) > 0 && customers[i].getCardNumber().compareTo(end) < 0) {
				CustomerLogic.viewCustomer(customers[i]);
				noResults = false;
			}
		}
		if (noResults)
			System.out.println("Нет карт в этом интервале");

	}

	public static String rangeInput(String limit) {

		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			limit = sc.nextLine();
			if (!limit.matches("\\d{16}"))
				System.out.println("Номер карты состоит из 16 цифр, повторите попытку");
		} while (!limit.matches("\\d{16}"));

		return limit;
	}
}