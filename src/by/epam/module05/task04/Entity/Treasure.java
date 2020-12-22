package by.epam.module05.task04.Entity;

public abstract class Treasure {
	
	private double cost;
	
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
    @Override
    public abstract String toString();

}
