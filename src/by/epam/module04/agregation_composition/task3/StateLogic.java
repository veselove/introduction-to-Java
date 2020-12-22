package by.epam.module04.agregation_composition.task3;

public class StateLogic {

	public static void viewTheCapital(Region[] regions) {
		for (int i = 0; i < regions.length; i++) {
			City tmp = regions[i].getRegionalCenter();
			if (tmp.getCapitalStatus()) {
				System.out.println(tmp.getName() + " is the capital of " + State.getNameOfState());
			}

		}

	}

	public static void viewNumberOfRegions(Region[] regions) {
		System.out.println("The state is divided into " + regions.length + " regions");
	}

	public static void viewAreaOfState(Region[] regions) {
		double totalArea = 0.0;
		for (int i = 0; i < regions.length; i++) {
			totalArea += regions[i].getArea();
		}
		System.out.println("The area of the state is " + totalArea);
	}

	public static void viewRegionalCenters(Region[] regions) {
		System.out.print("Regional centers: ");
		for (int i = 0; i < regions.length; i++) {
			System.out.print(regions[i].getRegionalCenter() + " ");
		}
	}
}
