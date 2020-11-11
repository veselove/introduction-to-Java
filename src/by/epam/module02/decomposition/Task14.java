package by.epam.module02.decomposition;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.
 */

public class Task14 {

	public static void main(String[] args) {

		int k = 1000;

		printArmstrongNumbers(k);
	}

	private static void printArmstrongNumbers(int num1) {

		for (int i = 1; i <= num1; i++) {
			if (calculation(i) == i) {
				System.out.print(i + " ");
			}
		}

	}

	private static int numberOfDigits(int num2) {

		int count = 0;

		while (num2 > 0) {
			count++;
			num2 /= 10;
		}

		return count;
	}

	private static int calculation(int num) {

		int result = 0;
		int temp = num;
		double digit;

		while (temp > 0) {
			digit = temp % 10;
			result += Math.pow(digit, numberOfDigits(num));
			temp /= 10;
		}

		return result;

	}

}
