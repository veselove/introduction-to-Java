package by.epam.module04.agregation_composition.task3;

public class State {

	private static String name;
	private static Region[] regions;

	public State(String name) {
		State.name = name;

	}

	public void setNameOfState(String name) {
		State.name = name;
	}

	public static String getNameOfState() {
		return name;
	}

	public Region[] getRegions() {
		return regions;
	}

	public static void setRegions(Region[] regions) {
		State.regions = regions;
	}

}
