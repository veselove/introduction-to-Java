package by.epam.module05.task05;

import java.util.Scanner;
import by.epam.module05.task05.Entity.Composition;
import by.epam.module05.task05.Entity.Flower.Chrysanthemum;
import by.epam.module05.task05.Entity.Flower.Gerbera;
import by.epam.module05.task05.Entity.Flower.Orchid;
import by.epam.module05.task05.Entity.Flower.Peony;
import by.epam.module05.task05.Entity.Flower.Rose;
import by.epam.module05.task05.Entity.Flower.Tulip;
import by.epam.module05.task05.Entity.Wrapper.ConeBag;
import by.epam.module05.task05.Entity.Wrapper.Felt;
import by.epam.module05.task05.Entity.Wrapper.Foil;
import by.epam.module05.task05.Entity.Wrapper.Mesh;
import by.epam.module05.task05.Entity.Wrapper.Paper;
import by.epam.module05.task05.Logic.CompositionBuilder;
import by.epam.module05.task05.Logic.View;

public class Menu {
	
	public static void mainMenu(Composition composition) {
		System.out.println("Press 1 to add flower;\n"
				+ "Press 2 to select wrapper;\n"
				+ "Press 3 to display the resulting composition.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		while (!sc.hasNext("[1-3]")) {
		System.out.println("wrong choice, try again >>");
		sc.next();
		}
		String mode = sc.next();		
				switch(mode) {
				case "1": 
					addFlowerMenu(composition);
				    break;
				case "2": 
					selectWrapperMenu(composition);
					break;
				case "3": 
					if (CompositionBuilder.compositionFormedDetector(composition)) {
					View.viewFlowersSetInfo(composition);
					View.viewWrapperInfo(composition);
					View.viewCostOfComposition(composition);
					break;
					}
					else {
						System.out.println("Error, no plant selected or no wrapper selected");
						mainMenu(composition);
					}
				}
	}
	
	public static void addFlowerMenu(Composition composition) {
		System.out.println("1. Chrysanthemum\n"
				+ "2. Gerbera\n"
				+ "3. Orchid\n"
				+ "4. Peony\n"
				+ "5. Rose\n"
				+ "6. Tulip\n"
				+ "Select the appropriate flower number or \"0\" to go to the wrapper selection");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		while (!sc.hasNext("[1-6]")) {
		System.out.println("Wrong choice, try again >>");
		sc.next();
		}
		String flowerType = sc.next();
				switch(flowerType) {
				case "0": 
					selectWrapperMenu(composition);
					break;
				case "1": 
					CompositionBuilder.addFlower(composition, new Chrysanthemum());
					break;
				case "2": 
					CompositionBuilder.addFlower(composition, new Gerbera());
					break;
				case "3": 
					CompositionBuilder.addFlower(composition, new Orchid());
					break;
				case "4": 
					CompositionBuilder.addFlower(composition, new Peony());
					break;
				case "5": 
					CompositionBuilder.addFlower(composition, new Rose());
					break;
				case "6": 
					CompositionBuilder.addFlower(composition, new Tulip());
					break;
				}
	
	}
	
	public static void selectWrapperMenu(Composition composition) {
		
		System.out.println("1. Paper\n"
				+ "2. Mesh\n"
				+ "3. Foil\n"
				+ "4. Felt\n"
				+ "5. ConeBag\n"
				+ "Select the appropriate wrapper number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		while (!sc.hasNext("[1-5]")) {
		System.out.println("Wrong choice, try again >>");
		sc.next();
		}
		String wrapperType = sc.next();
				switch(wrapperType) {
				case "1": 
					CompositionBuilder.addWrapper(composition, new Paper());
					break;
				case "2": 
					CompositionBuilder.addWrapper(composition, new Mesh());
					break;
				case "3": 
					CompositionBuilder.addWrapper(composition, new Foil());
					break;
				case "4": 
					CompositionBuilder.addWrapper(composition, new Felt());
					break;
				case "5": 
					CompositionBuilder.addWrapper(composition, new ConeBag());
					break;
				}
	}
	

}
