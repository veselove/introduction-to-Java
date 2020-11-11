package by.epam.module02.multidimensional_array;

import java.util.Random;

/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */

public class Task9 {
	
	public static void main(String[] args) {
		
		int[][] nums = new int[10][10];
		
		Random randomnumber = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = randomnumber.nextInt(100);
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int max = 0;
		int columnIndex = 0;
		int maxSumColumn = 0;
		
		for (int j = 0; j < nums.length; j++) {
			int sum = 0;
			for (int i = 0; i < nums[j].length; i++) {
				sum += nums[i][j];
			}
			System.out.print("Sum of column " + columnIndex + ": " + sum + "\n");
			if (sum >= max) {
				max = sum;
				maxSumColumn = columnIndex;
			}
			columnIndex++;
		}
		
		System.out.println("\nThe maximum amount contains column number " + maxSumColumn + " and it is " + max);
		System.out.println("(Counting columns starts at 0)");
		
	}

}
