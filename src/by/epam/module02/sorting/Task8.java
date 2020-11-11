package by.epam.module02.sorting;

/*
Даны дроби(p1/q1),(p2/q2),...(pn/qn) (pi , qi - натуральные).
Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {

	public static void main(String[] args) {

		int n = 10;

		int[] numerators = new int[n];
		int[] denominators = new int[n];

		for (int i = 0; i < n; i++) {
			numerators[i] = (int) (Math.random() * 9 + 1);
			denominators[i] = (int) (Math.random() * 9 + 1);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + ", ");
		}

		System.out.println("\n\nВring to a common denominator:");

		setCommonDenominator(numerators, denominators);

		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + ", ");
		}

		sortFractions(numerators);

		System.out.println("\n\nArranging numbers in ascending order:");

		for (int i = 0; i < n; i++) {
			System.out.print(numerators[i] + "/" + denominators[i] + ", ");
		}
	}

	private static void setCommonDenominator(int[] numerators, int[] denominators) {
		int maximum = denominators[0];
		for (int i = 1; i < denominators.length; i++) {
			if (denominators[i] > maximum)
				maximum = denominators[i];
		}

		int count;
		int step = maximum;

		do {
			count = 0;
			for (int i = 0; i < denominators.length; i++) {
				if (maximum % numerators[i] > 0)
					count++;
			}
			maximum += step;
		} while (count > 0);

		int commonDenom = maximum - step;

		for (int i = 0; i < denominators.length; i++) {
			numerators[i] = commonDenom / denominators[i] * numerators[i];
			denominators[i] = commonDenom;
		}

	}

	private static void sortFractions(int[] numerators) {

		for (int i = 0; i < numerators.length; i++) {
			for (int j = 1; j < numerators.length; j++) {
				if (numerators[j - 1] > numerators[j]) {
					int temp = numerators[j];
					numerators[j] = numerators[j - 1];
					numerators[j - 1] = temp;
				}
			}
		}

	}

}
