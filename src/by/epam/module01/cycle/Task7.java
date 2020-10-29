package by.epam.module01.cycle;

/*
Для каждого натурального числа в промежутке от m до n
вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

public class Task7 {

	public static void main(String[] args) {

		int start = 1;
		int end = 20;

		System.out.println("Numeric range: " + start + "..." + end);

		for (int i = start; i < end; i++) {

			int divCount;
			divCount = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					System.out.print(j + "  ");

					divCount++;

				}

			}

			if (divCount != 0)
				System.out.println("- for number " + i + ";");
		}

	}

}
