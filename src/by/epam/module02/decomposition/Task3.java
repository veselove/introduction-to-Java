package by.epam.module02.decomposition;

/*
Вычислить площадь правильного шестиугольника со стороной а,
используя метод вычисления площади треугольника.
 */

public class Task3 {

	public static void main(String[] args) {

		double side = 7;
		System.out.println(findArea(side));
	}

	private static double findArea(double a) {
		return ((a * a * 3 * Math.sqrt(3)) / 2);

	}

}
