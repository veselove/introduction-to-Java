package by.epam.module01.linear;

import java.util.Scanner;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class Task6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the X coordinate >>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		int x = sc.nextInt();

		System.out.println("Enter the Y coordinate >>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		int y = sc.nextInt();

		if ((y > -4 && y <= 0 && x > -5 && x < 5) || (y < 5 && y >= 0 && x > -3 && x < 3)) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}
}