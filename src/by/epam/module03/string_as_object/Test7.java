package by.epam.module03.string_as_object;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Test7 {

	public static void main(String[] args) {

		String text = "abc cde def fgh ghi hij klm mno";

		System.out.println(text);

		System.out.println(remove(text));
	}

	private static StringBuilder remove(String text) {

		text = text.replaceAll(" ", "");

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			if (text.indexOf(text.charAt(i)) == i) {
				builder.append(text.charAt(i));
			}
		}

		return builder;

	}

}
