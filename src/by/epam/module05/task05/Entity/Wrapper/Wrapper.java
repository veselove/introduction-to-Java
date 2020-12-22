package by.epam.module05.task05.Entity.Wrapper;

import java.util.Objects;

public abstract class Wrapper {

	private double price;
	private WrapperType wrapperType;

	public Wrapper(double price, WrapperType wrapperType) {
		this.price = price;
		this.wrapperType = wrapperType;
	}

	public Wrapper() {

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setWrapperType(WrapperType wrapperType) {
		this.wrapperType = wrapperType;
	}

	public WrapperType getWrapperType() {
		return wrapperType;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrapper wrapper = (Wrapper) obj;
		return Double.compare(price, wrapper.price) == 0 && 
				Objects.equals(wrapperType, wrapper.wrapperType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, wrapperType);
	}

	@Override
	public String toString() {
		return "wrapper type: " + wrapperType + ", price: " + price;
	}

}
