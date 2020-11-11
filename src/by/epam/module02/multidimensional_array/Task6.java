package by.epam.module02.multidimensional_array;

// Сформировать квадратную матрицу порядка n по заданному образцу (n - четное)

public class Task6 {

	public static void main(String[] args) {

		int n = 10;
		int a = n;
		int b = 0;

		int[][] nums = new int[n][n];

		// заполнение верхней половины матрицы:

		for (int i = 0; i < nums.length / 2; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (j < a && j >= b) {
					nums[i][j] = 1;
				}
			}
			a--;
			b++;
		}

		// заполнение нижней половины матрицы:

		for (int i = nums.length / 2 - 1; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (j < a && j >= b) {
					nums[i][j] = 1;
				}
			}
			a++;
			b--;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
