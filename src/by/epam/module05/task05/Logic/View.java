package by.epam.module05.task05.Logic;

import by.epam.module05.task05.Entity.Composition;

public class View {

	public static void viewFlowersSetInfo(Composition composition) {
		for (int i = 0; i < composition.getFlowersSet().size(); i++) {
			System.out.println(composition.getFlowersSet().get(i));
		}
	}

	public static void viewWrapperInfo(Composition composition) {
		System.out.println(composition.getWrapper());
	}

	public static void viewCostOfComposition(Composition composition) {
		System.out.println(
				"Total cost of flower composition: " + CompositionBuilder.calculateCostOfComposition(composition));
	}

}
