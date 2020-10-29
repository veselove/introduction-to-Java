package by.epam.module01.linear;

import java.util.Scanner;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Task5 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter duration in seconds >>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Enter again >> ");
		}
		int totalSeconds = sc.nextInt();

		int hours = totalSeconds / 3600;

		if (hours > 10) {
			System.out.print("Result: " + hours);
		} else {
			System.out.print("Result: " + "0" + hours);
		}
		System.out.print(":");

		int minutes = (totalSeconds - (hours * 3600)) / 60;

		if (minutes > 10) {
			System.out.print(minutes);
		} else {
			System.out.print("0" + minutes);
		}
		System.out.print(":");

		int seconds = (totalSeconds - (hours * 3600) - minutes * 60);

		if (seconds > 10) {
			System.out.print(seconds);
		} else {
			System.out.print("0" + seconds);
		}
	}
}