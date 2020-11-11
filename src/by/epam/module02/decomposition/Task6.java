package by.epam.module02.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Task6 {

	public static void main(String[] args) {

		int a = 13;
		int b = 17;
		int c = 19;

		if (coprimeNumbersDetector(a, b, c))
			System.out.println("These numbers are coprime");
		else
			System.out.println("These numbers are not coprime");
	}

	private static boolean coprimeNumbersDetector(int a, int b, int c) {

		int min;
		int counter = 0;

		if (a < b) {
			min = Math.min(c, a);
		} else {
			min = Math.min(c, b);
		}

		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				counter++;
			}
		}

		if (counter <= 1)
			return true;

		return false;

	}

}
