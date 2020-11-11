package by.epam.module02.multidimensional_array;

import java.util.Random;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class Task12 {

	public static void main(String[] args) {

		int[][] nums = new int[10][10];

		Random randomnumber = new Random();

		System.out.println("Initial array:");

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
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k = 0; k < nums[j].length - 1; k++) {
					if (mode == 1) {
						if (nums[i][k] > nums[i][k + 1]) {
							int tmp = nums[i][k];
							nums[i][k] = nums[i][k + 1];
							nums[i][k + 1] = tmp;
						}
					}
					if (mode == 2) {
						if (nums[i][k] < nums[i][k + 1]) {
							int temp = nums[i][k];
							nums[i][k] = nums[i][k + 1];
							nums[i][k + 1] = temp;
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
