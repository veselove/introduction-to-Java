package by.epam.module02.multidimensional_array;

import java.util.Random;

// Найти положительные элементы главной диагонали квадратной матрицы

public class Task10 {

	public static void main(String[] args) {

		int[][] nums = new int[10][10];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = getNumber();
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nPositive elements of the main diagonal of the matrix: ");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i][i] > 0)
				System.out.print(nums[i][i] + "  ");
		}

	}

	private static int getNumber() {

		Random randomnumber = new Random();
		int i = randomnumber.nextInt(10);
		boolean b = randomnumber.nextBoolean();
		if (b == true) {
			i = -i;
		}

		return i;

	}

}
