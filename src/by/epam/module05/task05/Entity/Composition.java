package by.epam.module05.task05.Entity;

import java.util.ArrayList;
import java.util.Objects;

import by.epam.module05.task05.Entity.Flower.Flower;
import by.epam.module05.task05.Entity.Wrapper.Wrapper;

public class Composition {

	private String name;
	ArrayList<Flower> flowersSet = new ArrayList<Flower>();
	private Wrapper wrapper;
	private double price;

	public Composition() {

	}

	public void setCompositionName(String name) {
		this.name = name;
	}

	public String getCompositionName() {
		return name;
	}

	public void setFlowerSet(ArrayList<Flower> flowersSet) {
		this.flowersSet = flowersSet;
	}

	public ArrayList<Flower> getFlowersSet() {
		return flowersSet;
	}

	public void setWrapper(Wrapper wrapper) {
		this.wrapper = wrapper;
	}

	public Wrapper getWrapper() {
		return wrapper;
	}

	public void setCost(double price) {
		this.price = price;
	}

	public double getCost() {
		return price;
	}

	public void addFlowerToComposition(Flower flower) {
		this.getFlowersSet().add(flower);
	}

	@Override
	public String toString() {
		return name + ", " + flowersSet + ", wrapper type: " + wrapper + "cost: " + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Composition composition = (Composition) obj;
		return price == composition.price && Objects.equals(name, composition.name)
				&& Objects.equals(wrapper, composition.wrapper);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, wrapper, price);
	}

}
