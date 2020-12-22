package by.epam.module05.task02;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

public class Main {

	public static void main(String[] args) {

		Payment Invoice0001 = new Payment();

		Invoice0001.addProduct("Bread", 1.02, 1);
		Invoice0001.addProduct("Milk", 1.69, 1);
		Invoice0001.addProduct("Eggs", 2.39, 2);
		Invoice0001.addProduct("Sugar", 1.54, 2);
		Invoice0001.addProduct("Flour", 2.75, 2);

		Invoice0001.viewDetails();

	}

}
