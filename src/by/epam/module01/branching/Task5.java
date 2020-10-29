package by.epam.module01.branching;

import java.util.Scanner;

//Вычислить значение функции

public class Task5 {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the argument x >>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		double x = sc.nextDouble();

		if (x <= 3.0) {
			System.out.println(x * x - 3.0 * x + 9.0);
		} else {
			System.out.println(1.0 / (x * x * x + 6.0));
		}
	}
}