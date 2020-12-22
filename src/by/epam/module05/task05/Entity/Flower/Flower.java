package by.epam.module05.task05.Entity.Flower;

import java.util.Objects;

public abstract class Flower {

	private FlowerType type;
	private double price;
	private int quantity;

	public Flower() {

	}

	public Flower(FlowerType type, double price, int quantity) {
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public void setFlowerType(FlowerType type) {
		this.type = type;
	}

	public FlowerType getFlowerType() {
		return type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower flower = (Flower) obj;
		return Double.compare(flower.price, price) == 0 &&
				Integer.compare(flower.quantity, quantity) == 0 &&
				Objects.equals(type, flower.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, price, quantity);
	}

	@Override
	public String toString() {
		return "flower: " + type + ", price for one: " + price + ", quantity: " + quantity;
	}
}
