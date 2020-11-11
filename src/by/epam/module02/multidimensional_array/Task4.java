package by.epam.module02.multidimensional_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task4 {

	public static void main(String[] args) {

		int n = 9;

		int[][] nums = new int[n][n];

		// формирование нечетных строк:

		for (int i = 0; i < nums.length; i += 2) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = j + 1;
			}
		}

		// формирование четных строк:

		for (int i = 1; i < nums.length; i += 2) {
			int t = n;
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = t;
				t--;
			}
		}

		// вывод результата на экран

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
