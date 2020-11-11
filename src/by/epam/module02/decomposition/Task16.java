package by.epam.module02.decomposition;

/*
* Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
* Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {

	public static void main(String[] args) {

		int n = 3;

		System.out.println("Number of digits: " + n);

		System.out.println("Result: " + sum(n));

		System.out.println("Even digits in result: " + evenDigitCounter(sum(n)));
	}

	private static int sum(int limit) {

		int sum = 0;

		limit = (int) Math.pow(10, (limit));

		for (int i = limit / 10; i < limit; i++) {
			if (evenDigitCounter(i) == 0)
				sum += i;
		}

		return sum;
	}

	private static int evenDigitCounter(int num) {

		int digit;
		int counter = 0;

		while (num > 0) {
			digit = num % 10;
			if (digit % 2 == 0)
				counter++;
			num /= 10;
		}

		return counter;

	}

}
