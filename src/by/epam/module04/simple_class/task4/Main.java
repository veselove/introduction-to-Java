package by.epam.module04.simple_class.task4;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Train[] trains = new Train[5];

		trains[0] = new Train("Гродно", 9052, 19, 00);
		trains[1] = new Train("Витебск", 9015, 8, 28);
		trains[2] = new Train("Гродно", 9002, 12, 14);
		trains[3] = new Train("Витебск", 9022, 16, 40);
		trains[4] = new Train("Гродно", 9016, 5, 45);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Нажмите клавишу, соответствующую необходимой операции:"
				+ "\n[1] - для сортировки строк по номерам поездов;"
				+ "\n[2] - для вывода информации о конкретном поезде по запросу от пользователя;"
				+ "\n[3] - для сортировки строк по пункту назначения");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		int mode = sc.nextInt();

		switch (mode) {
		case 1:
			TrainLogic.sortByTrainNumbers(trains);
			break;
		case 2:
			TrainLogic.showSelectedRoute(trains);
			break;
		case 3:
			TrainLogic.sortByDestination(trains);
			break;
		}
	}

}