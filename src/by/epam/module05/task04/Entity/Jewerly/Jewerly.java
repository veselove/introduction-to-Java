package by.epam.module05.task04.Entity.Jewerly;

import java.util.Objects;

import by.epam.module05.task04.Entity.Treasure;


public class Jewerly extends Treasure {
	
	public JewerlyType type;
	
	public Jewerly() {
		
	}

	public void setJewerlyType(JewerlyType jewerlyType) {
		this.type = jewerlyType;
		
	}
	
	public JewerlyType getJewerlyType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jewerly jewerly = (Jewerly) obj;
		return getCost() == jewerly.getCost();

	}

	@Override
	public int hashCode() {
		return Objects.hashCode(type);
	}

	@Override
	public String toString() {
		return "Jewerly, type: " + type + ", cost: " + getCost();
	}
}
