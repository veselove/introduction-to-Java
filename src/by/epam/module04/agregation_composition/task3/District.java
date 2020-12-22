package by.epam.module04.agregation_composition.task3;

public class District {

	private String name;
	private City districtCenter;

	public District(String name, City districtCenter) {
		this.name = name;
		this.districtCenter = districtCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		this.districtCenter = districtCenter;
	}

}
