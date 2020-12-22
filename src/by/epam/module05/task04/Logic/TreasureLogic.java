package by.epam.module05.task04.Logic;

import java.util.ArrayList;
import java.util.Scanner;

import by.epam.module05.task04.Entity.Treasure;

public class TreasureLogic {

	public static void showListOfTreasures(ArrayList<Treasure> list) {

		for (int i = 0; i < list.size(); i++) {
			viewTreasure(list.get(i), i);
		}
	}

	public static void viewTreasure(Treasure treasure, int listPosition) {
		System.out.println(listPosition + 1 + ". " + treasure.toString());
	}

	public static void viewTheMostExpensiveTreasure(ArrayList<Treasure> list) {

		int maxCostPosition = 0;

		double maxCost = 0.0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCost() > maxCost) {
				maxCostPosition = i;
				maxCost = list.get(i).getCost();
			}
		}
		System.out.println("The most expensive treasure is:");
		viewTreasure(list.get(maxCostPosition), maxCostPosition);
	}

	public static void collectTreasuresForATargetAmount(ArrayList<Treasure> listOfTreasures) {

		ArrayList<Treasure> selectedTreasures = new ArrayList<Treasure>();

		double moneyLimit = 0;

		System.out.println("Set the limit of money:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		moneyLimit = sc.nextDouble();

		for (int i = 0; i < 100; i++) {

			if (listOfTreasures.get(i).getCost() < moneyLimit) {
				selectedTreasures.add(listOfTreasures.get(i));
				moneyLimit -= listOfTreasures.get(i).getCost();
			}

		}

		System.out.println("The list is formed:");
		showListOfTreasures(selectedTreasures);

	}

}
