package by.epam.module03.string_as_object;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

	public static void main(String[] args) {

		String text = "One two  three   nine         eight        seven";

		System.out.println(text);

		System.out.println("Maximum number of spaces in a row: " + countSpaces(text));

	}

	private static int countSpaces(String text) {

		int maxValue = 0;
		int countSpaces = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				countSpaces++;
			else {
				if (countSpaces > maxValue) {
					maxValue = countSpaces;
				}
				countSpaces = 0;
			}
		}

		return maxValue;

	}

}
