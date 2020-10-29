package by.epam.module01.linear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Найдите значение функции: z = ((a – 3 )*b/2) + c.

public class Task1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number a");
		String numA = reader.readLine();
		double a = Integer.parseInt(numA);

		System.out.println("Enter the number b");
		String numB = reader.readLine();
		double b = Integer.parseInt(numB);

		System.out.println("Enter the number c");
		String numC = reader.readLine();
		double c = Integer.parseInt(numC);

		double z = ((a - 3) * b / 2) + c;

		System.out.print("z = " + z);
	}
}