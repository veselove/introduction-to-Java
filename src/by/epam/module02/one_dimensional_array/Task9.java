package by.epam.module02.one_dimensional_array;

/*
 * В массиве целых чисел с количеством элементов n найти наибольшее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		int[] array1 = new int[20];

		// array1 - исходный массив

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] = getNumber());
			System.out.print(" ");
		}

		System.out.println();

		int[] arrayCounter = new int[array1.length];

		// arrayCounter - массив с данными о количестве повторений каждого числа в
		// массиве array1

		for (int i = 0; i < array1.length; i++) {
			int counter = 0;
			for (int j : array1) {
				if (array1[i] == j) {
					counter++;
					arrayCounter[i] = counter;
				}
			}
		}

		int maxCounter = arrayCounter[0];

		// maxCounter содержит максимальное количество повторений одного числа в массиве
		// array1

		for (int i = 1; i < arrayCounter.length; i++) {
			if (arrayCounter[i] > maxCounter) {
				maxCounter = arrayCounter[i];
			}
		}

		int minValue = 0;

		// minValue - наименьшее из наиболее повторяющихся чисел

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > minValue) {
				minValue = array1[i];
			}
		}

		for (int i = 0; i < arrayCounter.length; i++) {
			if (arrayCounter[i] == maxCounter) {
				if (array1[i] < minValue)
					minValue = array1[i];
			}
		}

		System.out.println("\nMaximum repetitions: " + maxCounter);
		System.out.println("Smallest number of most repeating numbers: " + minValue);
	}

	private static int getNumber() {
		Random randomnumber = new Random();
		return randomnumber.nextInt(10);
	}
}
