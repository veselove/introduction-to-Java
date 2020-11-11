package by.epam.module02.decomposition;

/*
* Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
* которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task12 {

	public static void main(String[] args) {

		int k = 5;
		int n = 50;

		System.out.println("K = " + k + ", N = " + n);

		arrayCreator(k, n);
	}

	private static void arrayCreator(int k, int n) {

		int[] array = new int[setArraySize(k, n)];

		int count = 1;

		for (int i = 0; i < array.length; i++) {
			while (sumOfDigits(count) != k)
				count++;
			array[i] = count;
			count++;
			System.out.print(array[i] + " ");
		}
	}

	private static int setArraySize(int k, int n) {

		int arraySize = 0;

		for (int i = 0; i <= n; i++) {
			if (sumOfDigits(i) == k)
				arraySize++;
		}
		return arraySize;
	}

	private static double sumOfDigits(double num) {

		double sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
			int tmp = (int) num;
			num = tmp;
		}
		return sum;

	}

}
