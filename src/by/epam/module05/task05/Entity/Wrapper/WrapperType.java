package by.epam.module05.task05.Entity.Wrapper;

public enum WrapperType {

	PAPER("paper"),
	MESH("mesh"),
	FOIL("foil"),
	FELT("felt"),
	CONEBAG("cone bag");

	
private String type;
	
	WrapperType(String type){
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
