package by.epam.module04.agregation_composition.task3;

public class Region {

	private String nameOfRegion;
	private double area;
	private City regionalCenter;
	private District[] districts;

	public Region(String nameOfRegion, double area, City regionalCenter) {
		this.nameOfRegion = nameOfRegion;
		this.area = area;
		this.regionalCenter = regionalCenter;

	}

	public String getNameOfRegion() {
		return nameOfRegion;
	}

	public void setNameOfRegion(String nameOfRegion) {
		this.nameOfRegion = nameOfRegion;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public City getRegionalCenter() {
		return regionalCenter;
	}

	public void setRegionalCenter(City regionalCenter) {
		this.regionalCenter = regionalCenter;
	}

	public District[] getDistricts() {
		return districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

}
