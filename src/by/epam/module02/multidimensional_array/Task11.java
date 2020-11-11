package by.epam.module02.multidimensional_array;

import java.util.Random;

/*
 * Матрицу 10х20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
 */

public class Task11 {

	public static void main(String[] args) {

		int[][] nums = new int[10][20];
		
		Random randomnumber = new Random();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = randomnumber.nextInt(15);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		System.out.print("\n" + "Strings in which the number 5 occurs 3 or more times: ");

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == 5)
					count++;
			}
			if (count >= 3)
				System.out.print(i + "  ");
		}

		System.out.println("Counting columns starts at 0");

	}

}
