package by.epam.module02.one_dimensional_array;

/*
В массив А [N] занесены натуральные числа. Найти сумму тех элементов,
которые кратны данному К.
 */

public class Task1 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 3, 5, 7, 9, 11, 13, 15 };
		int K = 3;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] % K) == 0) {
				sum += nums[i];
			}
		}
		System.out.print(sum);
	}
}
