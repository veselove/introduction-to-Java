package by.epam.module02.multidimensional_array;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали 

public class Task2 {

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

		int a = 0;
		int b = 8;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j == a | j == b) {
					System.out.print(nums[i][j]);
				}
				System.out.print(" ");
			}
			System.out.println();
			a++;
			b--;
		}
	}
}
