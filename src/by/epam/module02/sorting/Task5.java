package by.epam.module02.sorting;

/*
Сортировка вставками. Дана последовательность чисел a1, a2...an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2...ai - упорядоченная последовательность, т. е.
a1<=a2...<=an . Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {

	public static void main(String[] args) {

		int[] arr = { 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		sortingByInsert(arr);

		print(arr);
	}

	private static void sortingByInsert(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				temp = array[i + 1];
				int j = binarySearch(array, 0, i, array[i + 1]);
				for (int k = i + 1; k > j; k--) {
					array[k] = array[k - 1];
				}
				array[j] = temp;
			}
		}
	}

	private static int binarySearch(int[] array, int low, int high, int key) {
		int middle;
		while (low <= high) {
			middle = high + low / 2;
			if (key > array[middle]) {
				low = middle + 1;
			} else if (key < array[middle]) {
				high = middle - 1;
			} else {
				return middle;
			}
		}
		return low;
	}

	private static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
