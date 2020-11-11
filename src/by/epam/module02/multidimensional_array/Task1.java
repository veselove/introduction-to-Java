package by.epam.module02.multidimensional_array;

import java.util.Random;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы,
 * у которых первый элемент больше последнего
 */

public class Task1 {

	public static void main(String[] args) {

		int[][] nums = new int[6][6];

		Random randomnumber = new Random();

		System.out.println("Original array:\n");

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = randomnumber.nextInt(10);
				System.out.print(nums[i][j] + " "); // вывод массива 6х6
			}
			System.out.println();
		}

		System.out.println("\nResult:\n");

		for (int i = 0; i < nums.length; i++) { // вывод нечетных столбцов, у которых
			for (int j = 1; j < nums[i].length; j += 2) { // первый элемент больше последнего
				if (nums[0][j] > nums[5][j]) {
					System.out.print(nums[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
