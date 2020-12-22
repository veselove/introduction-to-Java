package by.epam.module05.task04.Entity.Gemstone;

import java.util.Objects;

import by.epam.module05.task04.Entity.Treasure;


public class Gemstone extends Treasure {

	private GemstoneType type;

	public Gemstone() {

	}

	public void setGemstoneType(GemstoneType gemstoneType) {
		this.type = gemstoneType;

	}

	public GemstoneType getGemstoneType() {
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
		Gemstone gemstone = (Gemstone) obj;
		return Objects.equals(type, gemstone.type) &&
				getCost() == gemstone.getCost();

	}

	@Override
	public int hashCode() {
		return Objects.hashCode(type);
	}

	@Override
	public String toString() {
		return "Gemstone, type: " + type + ", cost: " + getCost();
	}

}
