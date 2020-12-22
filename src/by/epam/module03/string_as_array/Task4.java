package by.epam.module03.string_as_array;

// В строке найти количество чисел

public class Task4 {

	public static void main(String[] args) {

		String text = "Today is September 2, 2020, current time: 18 hours 30 minutes 45 seconds";
		
		System.out.println("Text: " + text);
		System.out.println("Amount of numbers: " + numberCounter(text));
	}

	private static int numberCounter(String text) {
		
		int count = 0;
		
		for (int i = 1; i < text.length(); i++) {
			if (isDigit(text.charAt(i - 1))) {
				if (isDigit(text.charAt(i)) == false)
					count++;
			}
		}
		
		if (isDigit(text.charAt(text.length() - 1)))
			count++;
		
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
