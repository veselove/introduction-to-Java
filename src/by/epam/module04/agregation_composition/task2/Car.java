package by.epam.module04.agregation_composition.task2;

public class Car {

	private String model;
	private Wheel[] wheels;
	private double fuel;

	public Car(String model, String engineModel, String fuelType, Wheel[] wheels, double fuel) {
		this.model = model;
		Engine engine = new Engine();
		engine.setEngineModel(engineModel);
		engine.setFuelType(fuelType);
		this.wheels = wheels;
		this.fuel = fuel;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public String getModel() {
		return model;
	}

	public double getLevelOfFuel() {
		return fuel;
	}

	public Wheel[] getWheels() {
		return wheels;
	}
	
}
