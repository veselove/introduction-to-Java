package by.epam.module03.string_as_array;

/*
* Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
* Крайние пробелы в строке удалить.
*/

public class Task5 {

	public static void main(String[] args) {

		String text = "   The   quick brown    fox     jumps  over  the    lazy dog   ";

		System.out.println("Text: " + text);
		System.out.print(removeExtraSpace(text));
	}

	private static StringBuilder removeExtraSpace(String string) {

		String text = string.trim();

		StringBuilder Builder = new StringBuilder();

		boolean isSpace = false;

		for (int i = 0; i < text.length(); i++) {
			if (!isSpace(text.charAt(i))) {
				Builder.append(text.charAt(i));
				isSpace = false;
			}

			if (isSpace(text.charAt(i)) && !isSpace) {
				Builder.append(" ");
				isSpace = true;
			}

		}
		return Builder;
	}

	private static boolean isSpace(char ch) {
		
		if ((int) ch == 32)
			return true;
		else
			return false;

	}

}
