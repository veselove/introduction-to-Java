package by.epam.module02.one_dimensional_array;

/*
Даны действительные числа a1, a2,..., an. Поменять местами
наибольший и наименьший элементы.
 */

public class Task4 {

	public static void main(String[] args) {

		double[] array1 = { 7, -10, 106, 9, 2.77, -0.001, 8, 2, 0.669, -4.88 };
		double minValue = array1[0];
		double maxValue = array1[0];
		int minIndex = 0;
		int maxIndex = 0;

		System.out.println("Original array:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println("\nThe largest and smallest elements replaced:");
		for (int i = 0; i < array1.length; i++)
			if (array1[i] < minValue) {
				minValue = array1[i];
				minIndex = i;
			}

		for (int i = 0; i < array1.length; i++)
			if (array1[i] > maxValue) {
				maxValue = array1[i];
				maxIndex = i;
			}

		array1[minIndex] = maxValue;
		array1[maxIndex] = minValue;

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
}