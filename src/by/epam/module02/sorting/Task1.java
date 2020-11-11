package by.epam.module02.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

public class Task1 {

	public static void main(String[] args) throws IOException {

		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] nums2 = { 40, 41, 42, 43 };

		for (int i = 0; i < nums1.length; i++)
			System.out.print(nums1[i] + " ");

		System.out.println();

		for (int i = 0; i < nums2.length; i++)
			System.out.print(nums2[i] + " ");

		System.out.println("\n" + "Enter the number k");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String numK = reader.readLine();
		int k = Integer.parseInt(numK);

		for (int i = 0; i < nums1.length; i++) {
			if (i == k) {
				for (int j = 0; j < nums2.length; j++) {
					System.out.print(nums2[j] + " ");
				}
			}
			System.out.print(nums1[i] + " ");
		}

	}

}
