package by.epam.module05.task04.Entity.Bullion;

public enum BullionType {

	GOLD("gold"), 
	SILVER("silver"), 
	PLATINUM("platinum");

	private String type;

	BullionType(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}

}
