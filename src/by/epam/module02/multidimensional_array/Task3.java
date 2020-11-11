package by.epam.module02.multidimensional_array;

import java.util.Random;

//Дана матрица. Вывести k-ю строчку и p-й столбец матрицы.

public class Task3 {

	public static void main(String[] args) {
		
		int[][] nums = new int[9][9];

		Random randomnumber = new Random();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = randomnumber.nextInt(10);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		int line = 4;
		int column = 6;

		System.out.println("\nCounting rows and columns starts at 0 (0...9);");

		System.out.println("\n" + "Line №" + line + ": ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[line][i] + " ");
		}
		System.out.println("\n\n" + "Column №" + column + ": ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i][column] + " ");
		}
	}
}
