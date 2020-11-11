package by.epam.module02.decomposition;

/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task5 {

	public static void main(String[] args) {

		int N = 20;

		int[] A = new int[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 100);
			System.out.print(A[i] + " ");
		}

		System.out.println("\nThe second largest number in the given array: " + secondLargestNumber(A));
	}

	private static int secondLargestNumber(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array[array.length - 2];

	}

}
