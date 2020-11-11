package by.epam.module02.one_dimensional_array;

public class Task10 {

	public static void main(String[] args) {

		int[] array1 = new int[40]; // создаем исходный массив

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i;
			System.out.print(array1[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < array1.length; i += 2) { // заменяем каждый второй элемент нулем
			array1[i] = 0;
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();

		int j = 1;

		for (int i = 0; i < array1.length; i++) { // сжимаем массив
			if (i < array1.length / 2) {
				array1[i] = array1[j];
				j += 2;
				System.out.print(array1[i] + " ");
			} else {
				array1[i] = 0;
				System.out.print(array1[i] + " ");
			}

		}

	}

}
