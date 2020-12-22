package by.epam.module05.task04;

import java.util.ArrayList;
import java.util.Scanner;

import by.epam.module05.task04.Entity.Treasure;
import by.epam.module05.task04.Logic.TreasureLogic;

public class ConsoleMenu {
	
	public static void menu(ArrayList<Treasure> list) {
		
		System.out.println("\nThe treasure list is formed.\nChoose next action:"
				+ "\nPress 1 to select the most expensive treasure;"
				+ "\nPress 2 to select treasures for a given amount.");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int mode = sc.nextInt();
		
		switch(mode) {
		
			case 1:
				TreasureLogic.viewTheMostExpensiveTreasure(list);
				break;
				
			case 2:
				TreasureLogic.collectTreasuresForATargetAmount(list);
				break;
				
		}
	}

}
