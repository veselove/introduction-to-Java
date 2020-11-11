package by.epam.module02.one_dimensional_array;

/*
Дана последовательность действительных чисел а1, а2,..., аn. Заменить все ее члены,
больше данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {
	public static void main(String[] args) {

		double[] nums = new double[10];
		double x = 0.0;
		double Z = 0.5;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = x;
			System.out.print(nums[i] + " ");
			x += 0.12;
		}

		System.out.println("\nZ = " + Z);

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > Z) {
				nums[i] = Z;
				count++;
			}
		}

		System.out.println("Number of replacements: " + count);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
