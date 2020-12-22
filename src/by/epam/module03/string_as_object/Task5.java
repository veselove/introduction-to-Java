package by.epam.module03.string_as_object;

// Подсчитать, сколько раз среди символов заданной строки встречается буква "a"

public class Test5 {

	public static void main(String[] args) {

		String text = "Disaster has also befallen many a golfer at this hole";
		
		System.out.println(text);

		System.out.println("Number of letters 'a': " + countTheLettersA(text));
	}

	private static int countTheLettersA(String text) {

		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a')
				count++;
		}

		return count;

	}

}
