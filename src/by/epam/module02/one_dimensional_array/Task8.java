package by.epam.module02.one_dimensional_array;

/*
 * Дана последовательность целых чисел а1, а2,..., аn. Образовать новую последовательность,
 * выбросив из исходной те члены, которые равны min(a1, a2,...,an).
 */

public class Task8 {
	public static void main(String[] args) {

		// int[] array1 = new int[20];

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 1, 8, 9, 10, 1, 12, 13 };

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		int min = array1[0];

		for (int i = 1; i < array1.length; i++) {
			if (array1[i] < min)
				min = array1[i];
		}

		System.out.println("\nMinimum is " + min);

		int counter = 0;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == min)
				counter++;
		}

		int j = 0;

		int[] array2 = new int[array1.length - counter];

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != min) {
				array2[j] = array1[i];
				j++;
			}
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

	}
}
