package by.epam.module03.string_as_object;

/*
С помощью функции копирования и операции конкатенации
составить из частей слова "информатика" слово "торт"
 */

public class Task4 {

	public static void main(String[] args) {

		String word = "информатика";
		
		System.out.println(word);

		String cake = "";

		cake += word.substring(7, 8) + word.substring(3, 5) + word.substring(7, 8);

		System.out.println(cake);

	}

}
