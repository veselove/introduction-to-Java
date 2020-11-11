package by.epam.module02.multidimensional_array;

import java.util.Random;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task15 {

	public static void main(String[] args) {

		int[][] nums = new int[7][7];

		Random randomnumber = new Random();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = randomnumber.nextInt(100);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		// Определяем наибольший элемент матрицы:

		int max = nums[0][0];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] > max)
					max = nums[i][j];
			}
		}

		System.out.println("\nThe largest element of the matrix is " + max + "\n");

		// Заменяем все нечетные элементы на него:

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] % 2 > 0)
					nums[i][j] = max;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
