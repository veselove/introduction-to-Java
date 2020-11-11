package by.epam.module02.multidimensional_array;

// Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)

public class Task5 {

	public static void main(String[] args) {

		int n = 8;

		int[][] nums = new int[n][n];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (j < n) {
					nums[i][j] = i + 1;
				}
			}
			n--;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
