package by.epam.module02.multidimensional_array;

import java.util.Random;

//Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов

public class Task13 {

	public static void main(String[] args) {

		int[][] nums = new int[10][10];

		Random randomnumber = new Random();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = randomnumber.nextInt(10);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nSort numbers in ascending order:");
		bubbleSort(nums, 1);

		System.out.println("\nSort numbers in descending order:");
		bubbleSort(nums, 2);
	}

	// Метод bubbleSort: mode == 1 - сортировка по возрастанию, mode == 2 -
	// сортировка по убыванию

	private static void bubbleSort(int[][] nums, int mode) {
		for (int j = 0; j < nums.length; j++) {
			for (int i = 0; i < nums.length; i++) {
				for (int k = 0; k < nums[i].length - 1; k++) {
					if (mode == 1) {
						if (nums[k][i] > nums[k + 1][i]) {
							int tmp = nums[k][i];
							nums[k][i] = nums[k + 1][i];
							nums[k + 1][i] = tmp;
						}
					}
					if (mode == 2) {
						if (nums[k][i] < nums[k + 1][i]) {
							int tmp = nums[k][i];
							nums[k][i] = nums[k + 1][i];
							nums[k + 1][i] = tmp;
						}
					}
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
