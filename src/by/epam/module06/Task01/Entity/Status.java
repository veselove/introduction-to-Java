package by.epam.module06.Task01.Entity;

public enum Status {
	
	STANDARD("standard"),
	ADMINISTRATOR("administrator");
	
	private String status;
	
	Status(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}

}
