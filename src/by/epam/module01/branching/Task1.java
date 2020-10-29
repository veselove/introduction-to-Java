package by.epam.module01.branching;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

public class Task1 {

	public static void main(String[] args) {

		int angle1 = 20;
		int angle2 = 70;
		int angle3 = angle1 + angle2;

		if ((angle3 < 180) && (angle3 > 0) && (angle1 != 0) && (angle2 != 0)) {
			System.out.println("Triangle exists");
			if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("Triangle is right-angled");
			} else {
				System.out.println("Triangle is not right-angled");
			}
		} else {
			System.out.println("Triangle does not exist");
		}
	}
}