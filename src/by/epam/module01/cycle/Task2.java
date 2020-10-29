package by.epam.module01.cycle;

//Вычислить значения функции на отрезке [а,b] c шагом h

public class Task2 {

	public static void main(String[] args) {

		int a = 2;
		int b = 15;
		int h = 3;

		for (int i = a; i <= b; i += h) {
			System.out.print(solution(i) + " ");
		}
	}

	private static int solution(int num) {
		if (num > 2) {
			return num;
		} else {
			return -num;
		}
	}
}
