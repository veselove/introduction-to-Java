package by.epam.module04.agregation_composition.task2;

public class CarLogic {

	public static void drive(Car car) {
		if (!emptyTankDetector(car.getLevelOfFuel()) && !flatTireDetector(car.getWheels())) {
			System.out.println("\nThe car is moving...");
		}
	}

	public static boolean emptyTankDetector(double fuelVolume) {
		boolean isEmptyTank = false;
		if (fuelVolume == 0.0) {
			isEmptyTank = true;
			System.out.println("\nAttention! The fuel has run out, please visit the gas station.");
		}
		return isEmptyTank;
	}

	public static boolean flatTireDetector(Wheel[] wheels) {
		boolean isFlatTire = false;
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].getPressure() == 0) {
				isFlatTire = true;
				System.out.println("\nAttention! The " + wheels[i].getPosition() + " wheel is flat!");
			}
		}
		return isFlatTire;
	}

	public static void toRefillTheCar(Car car) {
		System.out.println("\n...refuelling the car...");
		car.setFuel(70.0);
	}

	public static void toPumpUpTheWheels(Wheel[] wheels) {
		System.out.println("\n...pumping up the wheel / wheels...");
		for (int i = 0; i < wheels.length; i++) {
			wheels[i].setPressure(2.0);
		}
	}

}
