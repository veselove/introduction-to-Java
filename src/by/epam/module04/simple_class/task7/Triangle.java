package by.epam.module04.simple_class.task7;

public class Triangle {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;

	private double aSide;
	private double bSide;
	private double cSide;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;

		this.aSide = getSideLength(x1, y1, x2, y2);
		this.bSide = getSideLength(x2, y2, x3, y3);
		this.cSide = getSideLength(x3, y3, x1, y1);

	}

	double getSideLength(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public double getaSide() {
		return aSide;
	}

	public double getbSide() {
		return bSide;
	}

	public double getcSide() {
		return cSide;
	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}

	public double getX3() {
		return x3;
	}

	public double getY1() {
		return y1;
	}

	public double getY2() {
		return y2;
	}

	public double getY3() {
		return y3;
	}
}
