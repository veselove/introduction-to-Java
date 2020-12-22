package by.epam.module03.string_as_object;

/*
Строка Х состоит из нескольких предложений, каждое из которых кончается точкой,
восклицательным или вопросительным знаком. Определить количество предложений в строке Х
 */

public class Task10 {

	public static void main(String[] args) {

		String text = "-Who we are?\n" +
                "-Clients!\n" +
                "-What do we want?\n" +
                "-We don't know!\n" +
                "-When do we want it?\n" +
                "-Now!\n" +
                "-Great.";
        
		System.out.println(text);

		System.out.println("\nThere are " + countSentences(text) + " sentences in this text");
	}

	private static int countSentences(String text) {

		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if ((int) text.charAt(i) == 46 || (int) text.charAt(i) == 63 || (int) text.charAt(i) == 33) {
				count++;
			}
		}

		return count;

	}

}
