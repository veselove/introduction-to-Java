package by.epam.module04.agregation_composition.task2;

public class Task2 {

	public static void main(String[] args) {
		Wheel[] wheelsCar1 = new Wheel[4];
		wheelsCar1[0] = new Wheel("Left front", 2.0);
		wheelsCar1[1] = new Wheel("Right front", 2.0);
		wheelsCar1[2] = new Wheel("Left rear", 2.0);
		wheelsCar1[3] = new Wheel("Right rear", 2.0);

		Car car1 = new Car("Volkswagen Passat", "1.4 TSI", "gasoline", wheelsCar1, 70.0);

		System.out.print("The car is: " + car1.getModel() + "\n");

		// Case 1: out of fuel:

		car1.setFuel(0);

		// trying to go by car:

		CarLogic.drive(car1);

		// refuel the car:

		CarLogic.toRefillTheCar(car1);

		// Case 2: two wheels flat:

		wheelsCar1[0].setPressure(0.0);
		wheelsCar1[2].setPressure(0.0);

		// trying to go by car:

		CarLogic.drive(car1);

		// pump up the wheels:

		CarLogic.toPumpUpTheWheels(wheelsCar1);

		// Case 3: all is well, trying to go by car:

		CarLogic.drive(car1);
	}
}
