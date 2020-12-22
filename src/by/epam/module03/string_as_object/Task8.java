package by.epam.module03.string_as_object;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово
и вывести его на экран. Случай, когда самых длинных слов может быть
несколько, не обрабатывать.
 */

public class Task8 {

	public static void main(String[] args) {

		String text = "London is the capital of the United Kingdom";

		System.out.println(text);

		System.out.println(getSingleLongestWord(text));
	}

	private static String getSingleLongestWord(String text) {

		String[] arr = text.split(" ");

		int maxLength = 0;
		int maxLengthAdress = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
				maxLengthAdress = i;
			}
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (word.length() == maxLength)
				count++;
		}

		if (count > 1)
			return "The longest words are several";

		else
			return arr[maxLengthAdress];

	}

}
