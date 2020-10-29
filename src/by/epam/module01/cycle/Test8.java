package by.epam.module01.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Даны два числа. Определить цифры, входящие в запись
как первого, так и второго числа
 */

public class Test8 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the first number >>");
		String num1 = reader.readLine();

		System.out.println("Enter the second number >>");
		String num2 = reader.readLine();

		printCommonDigits(num1, num2);
	}

	private static void printCommonDigits(String num1, String num2) {

		System.out.print("Digits included in both numbers: ");

		for (int digit = 0; digit <= 9; digit++) {
			if (commonDigitDetector(digit, num1, num2))
				System.out.print(digit + " ");
		}
	}

	private static boolean commonDigitDetector(int digit, String num1, String num2) {

		boolean isDetected;
		isDetected = false;

		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				if (Character.getNumericValue(num1.charAt(i)) == digit
						&& Character.getNumericValue(num2.charAt(j)) == digit) {

					isDetected = true;
					break;
				}
			}
		}
		return isDetected;
	}
}
