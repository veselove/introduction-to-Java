package by.epam.module03.string_as_array;

// В строке найти количество цифр

public class Task3 {

	public static void main(String[] args) {

		String text = "Today is September 2, 2020, current time: 18 hours 30 minutes 45 seconds";

		System.out.println("Text: " + text);
		System.out.println("Number of digits: " + digitsCounter(text));
	}

	private static int digitsCounter(String text) {

		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (isDigit(text.charAt(i)))
				count++;
		}

		return count;
	}

	private static boolean isDigit(char ch) {

		boolean isDigit = false;

		char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch)
				isDigit = true;
		}

		return isDigit;

	}

}
