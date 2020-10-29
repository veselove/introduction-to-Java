package by.epam.module01.branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
Определить, пройдет ли кирпич черезотверстие.
*/

public class Task4 {

	public static void main(String args[]) {

		int holeSizeA = 130;
		int holeSizeB = 90;

		// Hole dimensions 130mm*90mm, brick dimensions x*y*z

		int x = 250;
		int y = 65;
		int z = 120;

		if (((holeSizeA >= x) && (holeSizeB >= y)) || ((holeSizeA >= y) && (holeSizeB >= x))
				|| ((holeSizeA >= x) && (holeSizeB >= z)) || ((holeSizeA >= z) && (holeSizeB >= x))
				|| ((holeSizeA >= y) && (holeSizeB >= z)) || ((holeSizeA >= z) && (holeSizeB >= y))) {
			System.out.println("Brick passes through a hole");
		} else {
			System.out.println("Brick does not pass through the hole");
		}
	}
}