package by.epam.module02.one_dimensional_array;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать,
сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class Task3 {
	public static void main(String[] args) {

		double[] nums = { -0.7, -0.6, -0.5, -0.4, -0.3, -0.2, -0.1, 0, 0.1, 0.2, 0.3, 0.4 };

		int negativeNumCounter = 0;
		int positiveNumCounter = 0;
		int zeroNumCounter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				negativeNumCounter++;
			} else if (nums[i] < 0) {
				positiveNumCounter++;
			} else if (nums[i] == 0) {
				zeroNumCounter++;
			}
		}
		System.out.println("\nNegative elements in an array: " + positiveNumCounter
				+ "\nPositive elements in an array: " + negativeNumCounter + "\nZero elements: " + zeroNumCounter);
	}

}
