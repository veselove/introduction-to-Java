package by.epam.module02.one_dimensional_array;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел,
порядковые номера которых являются простыми числами.
 */

public class Task6 {

	public static void main(String[] args) {

		double[] array1 = new double[20];
		double n = 0;

		for (int i = 0; i < array1.length; i++) {
			array1[i] = n;
			n += 0.5;
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();

		double sum = 0;

		for (int i = 0; i < array1.length; i++) {
			if (primeNumberDetector(i))
				sum += array1[i];
		}
		System.out.println(sum);
	}

	private static boolean primeNumberDetector(int a) {
		int counter = 0;
		boolean b = false;
		for (int i = 2; i < a; i++) {
			if ((a % i) == 0)
				counter++;
		}
		if (a == 1 || counter == 0)
			b = true;
		return b;
	}
}
