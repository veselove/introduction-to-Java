package by.epam.module05.task05.Entity.Flower;

public enum FlowerType {

	CHRYSANTHEMUM("chrysanthemum"),
	ROSE("rose"),
	ORCHID("orchid"),
	TULIP("tulip"),
	PEONY("peony"),
	GERBERA("gerbera");
	
	
	private String type;
	
	FlowerType(String type){
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
