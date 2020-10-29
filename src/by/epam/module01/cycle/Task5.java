package by.epam.module01.cycle;

/*
Даны числовой ряд и некоторое число е. Найти сумму
тех членов ряда, модуль которых больше или равен заданному е.
 */

public class Task5 {
	public static void main(String[] args) {

		double e = 0.05;
		double sum = 0.0;
		int n = 1;

		System.out.println("e = 0.05");

		while (1 == 1) {

			double result = Math.pow(2.0, -n) + Math.pow(3.0, -n);

			if (result > e) {

				System.out.println("n = " + n + ", result = " + result);

				n++;

				sum += result;

			}

			else
				break;

		}

		System.out.println("sum: " + sum);

	}
}

/*
 * e = 0.05 n = 1, result = 0.8333333333333333 n = 2, result =
 * 0.3611111111111111 n = 3, result = 0.16203703703703703 n = 4, result =
 * 0.07484567901234568 sum: 1.4313271604938271
 */
