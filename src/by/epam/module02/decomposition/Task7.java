package by.epam.module02.decomposition;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task7 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if ((array[i] + 1) % 2 == 0)
				sum += factorial(array[i]);
		}

		System.out.println(sum);
	}

	private static int factorial(int a) {

		int sum = a;

		for (int i = a - 1; i > 0; i--) {
			sum *= i;
		}

		return sum;

	}

}
