package by.epam.module02.decomposition;

/*
* Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
* последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task15 {

	public static void main(String[] args) {

		int n = 6;

		show123Numbers(n);
	}

	private static void show123Numbers(int limit) {

		limit = (int) Math.pow(10, (limit));

		for (int i = limit / 10; i < limit; i++) {
			if (detector123(i))
				System.out.println(i);
		}
	}

	private static boolean detector123(int num) {

		int digit1 = num % 10;
		int digit2;
		int count = 0;

		num /= 10;

		while (num > 0) {
			digit2 = num % 10;
			if (digit1 - digit2 != 1)
				count++;
			digit1 = digit2;
			num /= 10;
		}

		if (count == 0)
			return true;

		else
			return false;
	}
}
