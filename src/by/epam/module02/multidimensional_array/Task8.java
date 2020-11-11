package by.epam.module02.multidimensional_array;

import java.util.Scanner;

/*
 * В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца
 * поставить на соответствующие им позиции другого, а эти элементы второго переместить в
 * первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {

	public static void main(String[] args) {

		int[][] nums = new int[9][10];
		int counter = 10;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = counter;
				counter++;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("\nCounting columns starts at 0;");
		System.out.println("Enter the number of the first column (0...9) >>");
		int firstColumn = sc.nextInt();

		System.out.println("Enter the number of the second column (0...9) >>");
		int secondColumn = sc.nextInt();

		System.out.println("Replacement result:");

		int temp = secondColumn;

		for (int i = 0; i < nums.length; i++) {
			temp = nums[i][firstColumn];
			nums[i][firstColumn] = nums[i][secondColumn];
			nums[i][secondColumn] = temp;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
