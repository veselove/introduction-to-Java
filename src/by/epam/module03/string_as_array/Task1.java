package by.epam.module03.string_as_array;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
*/

public class Task1 {

	public static void main(String[] args) {

		String[] array = { "greatestCommonMultiple", "leastCommonMultiple", "evenDivisor", "oddDivisor" };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "  --->   " + getSnakeCase(array[i]) + " ");
		}
	}

	private static StringBuilder getSnakeCase(String camelCaseName) {

		StringBuilder builder = new StringBuilder();

		char[] chars = camelCaseName.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (Character.isLowerCase(chars[i])) {
				builder.append(chars[i]);
			} else {
				builder.append("_" + Character.toLowerCase(chars[i]));
			}
		}

		return builder;

	}

}
