package by.epam.module05.task04.Entity.Jewerly;

public enum JewerlyType {
	
	RING("ring"),
	BRACELET("bracelet"),
	BROCH("broch"),
	NECKLACE("necklace"),
	BEADS("beads"),
	CROSS("cross");
	
	private String type;
	
	JewerlyType(String type) {
		this.type = type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}

}
