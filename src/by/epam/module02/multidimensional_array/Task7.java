package by.epam.module02.multidimensional_array;

/*
 * Сформировать квадратную матрицу порядка N по правилу sin((((d * d) - (e * e))/f))
 * и подсчитать количество положительных элементов в ней
 */

public class Task7 {

	public static void main(String[] args) {

		int n = 10;
		
		float[][] nums = new float[n][n];
		
		int positiveCounter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				nums[i][j] = getNumber(i, j, n);
				if (nums[i][j] > 0)
					positiveCounter++;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nPositive elements: " + positiveCounter);
	}

	private static float getNumber(int i, int j, int n) {
		float floatI = i;
		float floatJ = j;
		float floatN = n;
		return (float) Math.sin((((floatI * floatI) - (floatJ * floatJ)) / floatN));

	}

}
