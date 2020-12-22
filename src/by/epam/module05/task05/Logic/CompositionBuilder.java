package by.epam.module05.task05.Logic;

import java.util.Scanner;

import by.epam.module05.task05.Menu;
import by.epam.module05.task05.Entity.Composition;
import by.epam.module05.task05.Entity.Flower.Flower;
import by.epam.module05.task05.Entity.Wrapper.Wrapper;

public class CompositionBuilder {

	public static void addFlower(Composition composition, Flower flower) {
		System.out.println("Enter the quantity of flowers");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Wrong choice, enter the quantity of flowers again >>");
			sc.next();
		}
		int quantity = sc.nextInt();
		flower.setQuantity(quantity);
		composition.addFlowerToComposition(flower);
		Menu.mainMenu(composition);
	}

	public static void addWrapper(Composition composition, Wrapper wrapper) {
		composition.setWrapper(wrapper);
		Menu.mainMenu(composition);
	}

	public static double calculateCostOfComposition(Composition composition) {
		double totalCost = 0.0;
		for (int i = 0; i < composition.getFlowersSet().size(); i++) {
			totalCost += (composition.getFlowersSet().get(i).getPrice()
					* composition.getFlowersSet().get(i).getQuantity());
		}
		totalCost += composition.getWrapper().getPrice();
		return totalCost;
		
	
}

	public static boolean compositionFormedDetector(Composition composition) {
		boolean flag = true;
		if (composition.getFlowersSet().size() == 0 | composition.getWrapper() == null) {
			flag = false;
		}
		return flag;
	}
}
