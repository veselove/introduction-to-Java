package by.epam.module01.branching;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
Определить, будут ли они расположены на одной прямой.
*/

public class Task3 {

	public static void main(String args[]) {

		int x1 = -2;
		int y1 = 1;
		int x2 = -4;
		int y2 = 2;
		int x3 = 2;
		int y3 = -1;

		if ((((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1))) == 0) {
			System.out.println("Points are located on a common straight line");
		} else {
			System.out.println("Points are not on a common straight line");
		}
	}
}