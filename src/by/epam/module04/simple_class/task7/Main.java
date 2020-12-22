package by.epam.module04.simple_class.task7;

/* 
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
*/

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Triangle triangle = new Triangle(0, 0, 0, 2, 2, 0);
		
		System.out.println("Triangle A(" + triangle.getX1() + ", " + triangle.getY1() +
				"), B(" + triangle.getX2() + ", " + triangle.getY2() + 
				"), C(" + triangle.getX3() + ", " + triangle.getY3() + ")");

		TriangleLogic triangleLogic = new TriangleLogic();

		System.out.println("Perimeter: " + triangleLogic.getPerimeter(triangle));

		System.out.println("Area: " + triangleLogic.getArea(triangle));

		System.out.println("Сoordinates of the median intersection point: "
				+ Arrays.toString(triangleLogic.getMedianPoint(triangle)));

	}

}
