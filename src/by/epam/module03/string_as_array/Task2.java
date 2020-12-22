package by.epam.module03.string_as_array;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {

	public static void main(String[] args) {

		String text = "One word two word three word four word five word";

		// first variant:

		String processed = text.replace("word", "letter");
		System.out.println(processed);

		// second variant:

		changeWord(text);
	}

	private static void changeWord(String text) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'w' && text.charAt(i + 1) == 'o' && text.charAt(i + 2) == 'r'
					&& text.charAt(i + 3) == 'd') {
				builder.append("letter");
				i += 3;
			} else
				builder.append(text.charAt(i));
		}

		System.out.print(builder);

	}

}
