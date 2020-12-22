package by.epam.module05.task04.Entity.Coin;

import by.epam.module05.task04.Entity.Treasure;

public class Coin extends Treasure {
	
	public Coin() {
		
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coin coin = (Coin) obj;
		return getCost() == coin.getCost();

	}


	@Override
	public String toString() {
		return "Coin, cost: " + getCost();
	}
}
