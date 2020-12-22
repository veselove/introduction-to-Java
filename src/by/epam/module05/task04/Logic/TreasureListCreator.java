package by.epam.module05.task04.Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import by.epam.module05.task04.Entity.Treasure;
import by.epam.module05.task04.Entity.Bullion.Bullion;
import by.epam.module05.task04.Entity.Bullion.BullionType;
import by.epam.module05.task04.Entity.Coin.Coin;
import by.epam.module05.task04.Entity.Gemstone.Gemstone;
import by.epam.module05.task04.Entity.Gemstone.GemstoneType;
import by.epam.module05.task04.Entity.Jewerly.Jewerly;
import by.epam.module05.task04.Entity.Jewerly.JewerlyType;

public class TreasureListCreator {
	
	public static ArrayList<Treasure> createRandomList() {
		
		ArrayList<Treasure> treasures = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			int a = (int) (1 + Math.random()*4);
			switch(a) {
			case 1:
				treasures.add(getRandomGemstone());
				break;
			case 2:
				treasures.add(getRandomBullion());
				break;
			case 3:
				treasures.add(getRandomJewerly());
				break;
			case 4:
				treasures.add(getRandomCoin());
				break;	
			}
		}
		return treasures;
	}
			
			
			
			public static Gemstone getRandomGemstone() {

				Gemstone gemstone = new Gemstone();

				GemstoneType[] types = GemstoneType.values();

				Arrays.toString(GemstoneType.values());

				Random rnd = new Random();

				int i = rnd.nextInt(types.length);

				gemstone.setGemstoneType(types[i]);

				gemstone.setCost(getRandomCost());

				return gemstone;

			}
			
			
			
			public static Bullion getRandomBullion() {
				
				Bullion bullion = new Bullion();

				BullionType[] types = BullionType.values();

				Arrays.toString(BullionType.values());

				Random rnd = new Random();

				int i = rnd.nextInt(types.length);

				bullion.setBullionType(types[i]);

				bullion.setCost(getRandomCost());

				return bullion;
				
			}
			
			
			
			public static Jewerly getRandomJewerly() {
				
				Jewerly jewerly = new Jewerly();

				JewerlyType[] types = JewerlyType.values();

				Arrays.toString(JewerlyType.values());

				Random rnd = new Random();

				int i = rnd.nextInt(types.length);

				jewerly.setJewerlyType(types[i]);

				jewerly.setCost(getRandomCost());

				return jewerly;
				
			}
			
			
			
			public static Coin getRandomCoin() {
				
				Coin coin = new Coin();

				coin.setCost(getRandomCost());

				return coin;
				
			}
			
			

			public static double getRandomCost() {

				Random rnd = new Random();

				int i = 50 + rnd.nextInt(1000);

				double j = (double) i / 100;

				double randomCost = (i + j);

				return randomCost;

			}
			
			
			
			
			

}