package by.epam.module03.string_as_object;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {

	public static void main(String[] args) {

		String word = "redivider";

		if (isPalindrome(word))
			System.out.print("This word is palindrome");
		else {
			System.out.print("This word isn't a palindrome");
		}
	}

	private static boolean isPalindrome(String word) {

		boolean isPal = true;

		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1))
				isPal = false;
		}

		return isPal;

	}

}
