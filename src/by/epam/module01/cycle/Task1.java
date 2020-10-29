package by.epam.module01.cycle;

import java.util.Scanner;

/*
Напишите программу, где пользователь вводит любое целое положительное число. 
А программа суммирует все числа от 1 до введенного пользователем числа.
*/

public class Task1 {

	public static void main(String[] args) {

		int num;
		int sum;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please enter a positive number >>");
			while (!sc.hasNextInt()) {
				System.out.println("That not a number, try again >>");
				sc.next();
			}
			num = sc.nextInt();
		} while (num <= 0);
		sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
