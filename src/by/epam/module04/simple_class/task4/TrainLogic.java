package by.epam.module04.simple_class.task4;

import java.util.Scanner;

public class TrainLogic {

	public static void sortByTrainNumbers(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {
			for (int j = 1; j < trains.length; j++) {
				if (trains[j].getTrainNumber() < trains[j - 1].getTrainNumber())
					swap(trains, j, j - 1);
			}
		}
		for (int i = 0; i < trains.length; i++) {
			trains[i].viewTrainInfo();
		}
	}

	public static void showSelectedRoute(Train[] trains) {

		System.out.println("Введите номер интересуещего вас поезда >>");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Введите снова >> ");
		}
		int selectedRoute = sc.nextInt();

		boolean noTrain = true;
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getTrainNumber() == selectedRoute) {
				noTrain = false;
				trains[i].viewTrainInfo();
			}
		}
		if (noTrain == true)
			System.out.println("Поезд с таким номером отсутствует");
	}

	public static void sortByDestination(Train[] trains) {

		for (int i = 0; i < trains.length; i++) {
			for (int j = 1; j < trains.length; j++) {
				if (compareWords(trains[j].getDestination(), trains[j - 1].getDestination()))
					swap(trains, j, j - 1);
			}
		}

		for (int i = 1; i < trains.length; i++) {
			for (int j = 1; j < trains.length; j++) {
				if (trains[j].getDestination() == trains[j - 1].getDestination()) {
					if (trains[j].getHours() * 60 + trains[j].getMinutes() < trains[j - 1].getHours() * 60
							+ trains[j - 1].getMinutes())
						swap(trains, j, j - 1);
				}
			}

		}

		for (int i = 0; i < trains.length; i++) {
			trains[i].viewTrainInfo();
		}

	}

	public static boolean compareWords(String s1, String s2) {

		boolean flag = true;

		int value = s1.compareTo(s2);

		if (value > 0)
			flag = false;

		return flag;
	}

	public static void swap(Train[] trains, int a, int b) {
		Train temp = trains[a];
		trains[a] = trains[b];
		trains[b] = temp;
	}
}
