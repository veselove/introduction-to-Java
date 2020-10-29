package by.epam.module01.branching;

//Найти max{min(a, b), min(c, d)}.

public class Task2 {

	public static void main(String args[]) {

		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;

		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
	}
}
