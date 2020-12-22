package by.epam.module03.string_as_object;

// Из заданной строки получить новую, повторив каждый символ дважды

public class Test6 {

	public static void main(String[] args) {

		String text = "London is the capital of the United Kingdom";

		System.out.println(text);

		System.out.println(doubleLetters(text));

	}

	private static StringBuilder doubleLetters(String text) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			builder.append(text.charAt(i));
			builder.append(text.charAt(i));
		}

		return builder;

	}

}
