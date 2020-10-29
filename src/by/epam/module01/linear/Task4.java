package by.epam.module01.linear;

import java.util.Scanner;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class Task4 {

	public static void main(String[] args) {

		System.out.println("Enter a number in the format nnn.ddd");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		double originalNum = Double.parseDouble(str);

		double newFractionalPart = (int) originalNum / 1000.0;

		double newIntegerPart = (int) ((1000 * originalNum) % 1000);

		double result = newIntegerPart + newFractionalPart;

		System.out.println(result);
	}
}
