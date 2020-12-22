package by.epam.module04.agregation_composition.task3;

public class City {

	private String name;
	boolean capitalStatus;

	public City(String name, boolean capitalStatus) {
		this.name = name;
		this.capitalStatus = capitalStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getCapitalStatus() {
		return capitalStatus;
	}

	public void setCapitalStatus(boolean capitalStatus) {
		this.capitalStatus = capitalStatus;
	}

	@Override
	public String toString() {
		return name;
	}

}
