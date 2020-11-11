package by.epam.module02.decomposition;

public class Task13 {
	
/*
* Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
* Найти и напечатать все пары «близнецов» из отрезка [n,2n],
* где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
	
	public static void main(String[] args) {

		int n = 50;

		printTwinNumbers(n);
	}

	private static boolean primeNumberDetector(int num) {
		
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count > 0)
			return false;
		else
			return true;
	}

	private static void printTwinNumbers(int num) {
		
		for (int i = 3; i <= num; i++) {
			if (primeNumberDetector(i) && primeNumberDetector(i - 2)) {
				System.out.println(i - 2 + ", " + i);
			}
		}
		
	}

}