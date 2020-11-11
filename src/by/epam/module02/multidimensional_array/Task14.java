package by.epam.module02.multidimensional_array;

import java.util.Random;

/*
 * Сформировать случайную матрицу mxn, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца
 */

public class Task14 {

	public static void main(String[] args) {

		int i;
		int j;

		Random randomnumber = new Random();

		i = randomnumber.nextInt(10);
		while (i < 2) {
			i = randomnumber.nextInt(10);
		}
		
		 // Условие задачи выполняется, если ширина матрицы больше длины хотя бы на 1

		j = randomnumber.nextInt(20);
		while (j < 2 || i + 1 < j) {
			j = randomnumber.nextInt(20);
		}

		int[][] nums = new int[i][j];

		for (i = 0; i < nums.length; i++) {
			for (j = 0; j < nums[i].length; j++) {
				if (i < j)
					nums[i][j] = 1;
			}
		}

		System.out.println("Counting columns starts at 0\n");

		for (i = 0; i < nums.length; i++) {
			for (j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}