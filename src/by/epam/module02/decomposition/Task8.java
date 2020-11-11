package by.epam.module02.decomposition;

/*
* Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
* Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
* элементов массива с номерами от k до m.
 */

public class Task8 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

		System.out.println("Counting starts at 0");

		for (int i = 0; i < nums.length - 2; i += 2) {

			int sum3 = nums[i] + nums[i + 1] + nums[i + 2];

			System.out.println("D[" + i + "] + D[" + (i + 1) + "] + D[" + (i + 2) + "] = " + sum3);

		}

	}

}
