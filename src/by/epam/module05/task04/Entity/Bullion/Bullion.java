package by.epam.module05.task04.Entity.Bullion;

import java.util.Objects;

import by.epam.module05.task04.Entity.Treasure;


public class Bullion extends Treasure  {
	
	private BullionType type;
	
	public Bullion() {
		
	}
	
	public void setBullionType(BullionType bullionType) {
		this.type = bullionType;
		
	}
	
	public BullionType getBullionType() {
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
		Bullion bullion = (Bullion) obj;
		return Objects.equals(type, bullion.type) &&
				getCost() == bullion.getCost();

	}

	@Override
	public int hashCode() {
		return Objects.hashCode(type);
	}

	@Override
	public String toString() {
		return "Bullion, type: " + type + ", cost: " + getCost();
	}

	
}
