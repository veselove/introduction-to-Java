package by.epam.module04.simple_class.task7;

public class TriangleLogic {

	public double getPerimeter(Triangle triangle) {
		return triangle.getaSide() + triangle.getbSide() + triangle.getcSide();
	}

	public double getArea(Triangle triangle) {
		double a = triangle.getaSide();
		double b = triangle.getbSide();

		double c = triangle.getcSide();

		return (Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c))) * 0.25;
	}

	public double[] getMedianPoint(Triangle trianlge) {
		double[] result = { (trianlge.getX1() + trianlge.getX2() + trianlge.getX3()) / 3,
				(trianlge.getY1() + trianlge.getY2() + trianlge.getY3()) / 3 };
		return result;
	}
}
