package by.epam.module02.decomposition;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК(А,В) = (А*В)/(НОД(А,В)).
 */

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a number A");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		int A = sc.nextInt();

		if (A < 0)
			A = -A;

		System.out.println("Input a number B");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		int B = sc.nextInt();

		if (B < 0)
			B = -B;

		System.out.println("Greatest common factor: " + greatestCommonFactor(A, B));
		System.out.println("Least common multiple: " + leastCommonMultiple(A, B));

	}

	private static int greatestCommonFactor(int a, int b) { // нахождение НОД

		int result = 0;

		if (a > b) {
			for (int i = 1; i <= b; i++) {
				if (a % i == 0 && b % i == 0)
					result = i;
			}
		}

		if (a < b) {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0 && b % i == 0)
					result = i;
			}
		}

		if (a == b)
			result = a;

		if (a == 0 || b == 0)
			result = 0;
		return result;
	}

	private static int leastCommonMultiple(int a, int b) { // нахождение НОК

		int result;

		if (a == 0 || b == 0)
			result = 0;

		else
			result = ((a * b) / greatestCommonFactor(a, b));

		return result;

	}

}
