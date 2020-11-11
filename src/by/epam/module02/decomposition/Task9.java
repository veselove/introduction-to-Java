package by.epam.module02.decomposition;

/*
* Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
* если угол между сторонами длиной X и Y— прямой.
 */

public class Task9 {

	public static void main(String[] args) {

		double x = 12;
		double y = 10;
		double z = 11;
		double t = 5;

		System.out.println("Area of a quadrangle: " + areaOfQuadRangle(x, y, z, t));
	}

	private static double areaOfQuadRangle(double a, double b, double c, double d) {
		
		double area1 = a * b / 2;
		
		double diagonal = Math.sqrt(a * a + b * b);
		
		double area2 = 0.25
				* Math.sqrt((c + d + diagonal) * (c + d - diagonal) * (d + diagonal - c) * (diagonal + c - d));
		
		return area1 + area2;

	}

}
