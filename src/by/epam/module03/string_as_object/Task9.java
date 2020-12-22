package by.epam.module03.string_as_object;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв
в веденной строке. Учитывать только английские буквы
 */

public class Task9 {

	public static void main(String[] args) {

		String text = "The Quick browN Fox jumPs oVer the LaZy Dog. Шустрая Бурая лисица123";

		System.out.println(text);

		letterCaseAnalyzer(text);
	}

	private static void letterCaseAnalyzer(String text) {

		int uppercaseCount = 0;
		int lowercaseCount = 0;

		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) > 64 && (int) text.charAt(i) < 91)
				uppercaseCount++;
			else if ((int) text.charAt(i) > 96 && (int) text.charAt(i) < 123)
				lowercaseCount++;
		}

		System.out.print("String contains " + uppercaseCount + " letters");

		System.out.println(" and " + lowercaseCount + " lowercase letters");

	}

}
