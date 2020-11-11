package by.epam.module02.decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {

	public static void main(String[] args) {

		int a = 18;
		int b = 81;
		int c = 54;
		int d = 72;

		System.out.println("Greatest common factor: " + greatestCommonFactor(a, b, c, d));
	}

	private static int greatestCommonFactor(int a, int b, int c, int d) {

		int result = 0;

		int min = Math.min(a, b);

		if (min > Math.min(c, d))
			min = Math.min(c, d);

		for (int i = 1; i <= min; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0)
				result = i;
		}

		return result;

	}

}
