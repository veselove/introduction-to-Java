package by.epam.module03.string_as_object;

// В строке вставить после каждого символа 'a' символ 'b'

public class Task2 {

	public static void main(String[] args) {

		String text = "a a a a a a a a a a a";

		// first way:

		System.out.println(text.replaceAll("a", "ab"));

		// second way:

		System.out.println(insertB(text));

	}

	private static StringBuilder insertB(String text) {

		StringBuilder Builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			Builder.append(text.charAt(i));
			if (text.charAt(i) == 'a')
				Builder.append('b');
		}

		return Builder;
	}

}
