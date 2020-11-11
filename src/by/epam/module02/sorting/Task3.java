package by.epam.module02.sorting;

/*
Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */

public class Task3 {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 7, 9, 9, 11, 13, 15, 17 };

		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int pos = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					pos = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[pos];
			nums[pos] = temp;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
