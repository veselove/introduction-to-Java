package by.epam.module02.decomposition;

import java.util.Scanner;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние. Указание.
 Координаты точек занести в массив.
 */

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number [n]:");

		int n = in.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int) (Math.random() * 200 - 100);
			y[i] = (int) (Math.random() * 200 - 100);
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print("(" + x[i] + ", " + y[i] + ")  ");
		}

		double maxDistance = 0.0;
		int farthestPoint1 = 0;
		int farthestPoint2 = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (findDistance(x[i], y[i], x[j], y[j]) > maxDistance) {
					maxDistance = findDistance(x[i], y[i], x[j], y[j]);
					farthestPoint1 = i;
					farthestPoint2 = j;
				}
			}
		}

		System.out.print("\n\nThe longest distance between two points: ");
		System.out.print("(" + x[farthestPoint1] + ", " + y[farthestPoint1] + "), ");
		System.out.println("(" + x[farthestPoint2] + ", " + y[farthestPoint2] + ")");
	}

	private static double findDistance(int x1, int y1, int x2, int y2) {
		return (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));

	}

}
