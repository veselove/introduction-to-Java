package by.epam.module01.cycle;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {

	public static void main(String[] args) {

		long sum = 1L;
		long maxValue = 9223372036854775807L;

		for (int i = 1; i <= 200; i++) {
			sum *= Math.pow(i, 2);
			if (sum == maxValue) {
				System.out.println(
						"At " + i + " iterations of the loop, " + "the result is out of the range of the \"Long\" type"
								+ " (result exceeded " + maxValue + ")");
				break;
			}
		}
	}
}
