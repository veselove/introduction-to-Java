package by.epam.module02.one_dimensional_array;

//Даны целые числа а1, а2,..., an. Вывести на печать только те числа, для которых ai > i.

public class Task5 {

	public static void main(String[] args) {

		int[] nums = { 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println("\nResult:");

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > i) {
				System.out.print(nums[i] + " ");
			}
		}
	}
}
