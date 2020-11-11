package by.epam.module02.decomposition;

/*
* Дано натуральное число N. Написать метод(методы) для формирования массива,
* элементами которого являются цифры числа N.
 */

public class Task10 {

	public static void main(String[] args) {

		int n = 1234567890;

		System.out.println("Original number:" + n);

		digitsToArray(n);
	}

	private static int countTheDigits(int n) {

		int count = (n == 0) ? 1 : 0;
		while (n != 0) {
			count++;
			n /= 10;
		}

		return count;
	}

	private static void digitsToArray(int n) {

		int[] digits = new int[countTheDigits(n)];

		String text = String.valueOf(n);

		for (int i = 0; i < digits.length; i++) {
			char temp = text.charAt(i);
			digits[i] = temp;
			System.out.print(temp + " ");
		}

	}

}
