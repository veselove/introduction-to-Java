package by.epam.module04.agregation_composition.task2;

public class Wheel {

	private String position;
	private double pressure;

	public Wheel(String position, double pressure) {
		this.position = position;
		this.pressure = pressure;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getPressure() {
		return pressure;
	}
}