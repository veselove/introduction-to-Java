package by.epam.module02.one_dimensional_array;

/*
Даны действительные числа a1, a2,...,an. Найти max(a1 + a2n, a2 + a2n-1,..., an + an+1)
 */

public class Task7 {

	public static void main(String[] args) {

		System.out.println("n = 10 \nArray a1, a2,...,a2n:");

		int n = 10;

		double[] array1 = new double[2 * n];

		for (int i = 0; i < 2 * n; i++) {
			array1[i] = Math.random();
		}

		for (int i = 0; i < 2 * n; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\nArray a1 + a2n, a2 + a2n-1,..., an + an+1:");

		double[] array2 = new double[n];

		int z = 2 * n - 1;

		for (int i = 0; i < n; i++) {
			array2[i] = array1[i] + array1[z];
			z--;
			System.out.print(array2[i] + " ");
		}

		System.out.println();

		double max = array2[0];

		for (int i = 1; i < array2.length; i++) {
			if (array2[i] > max) {
				max = array2[i];
			}
		}

		System.out.print("max(a1 + a2n, a2 + a2n-1,..., an + an+1):\n" + max);
	}
}
