package by.epam.module04.simple_class.task10;

import java.time.LocalTime;

public class AirlineLogic {

	public static void viewFlightsToTheSelectedDestination(Airline[] flights, String destination) {

		boolean noResults = true;

		System.out.println("List of flights for destination: " + destination);
		
		for (int i = 0; i < flights.length; i++) {
			if (flights[i].getDestination() == destination) {
				System.out.println(flights[i].toString());
				noResults = false;
			}
		}
		
		if (noResults)
			System.out.println("No search results");
	}
	
	
	

	public static void viewFlightsToTheSelectedDayOfWeek(Airline[] flights, DayOfWeek desiredDayOfWeek) {

		boolean noResults = true;

		System.out.println("\nList of flights for a given day of the week: " + desiredDayOfWeek);
		
		for (int i = 0; i < flights.length; i++) {
			if (findThisDay(flights[i].getDaysOfWeek(), desiredDayOfWeek)) {
				System.out.println(flights[i].toString());
				noResults = false;
			}
		}
		
		if (noResults)
			System.out.println("No search results");
	}
	
	
	

	public static void viewFlightsToTheSelectedDayOfWeekAndTime(Airline[] flights, DayOfWeek desiredDayOfWeek,
			LocalTime timeSetByUser) {

		boolean noResults = true;

		System.out.println("\nList of flights on " + desiredDayOfWeek
				+ ", the departure time for which is greater than " + timeSetByUser);
		
		for (int i = 0; i < flights.length; i++) {
			if (findThisDay(flights[i].getDaysOfWeek(), desiredDayOfWeek)) {
				if (detectIfSpecifiedTimeLater(flights[i].getDepartureTime(), timeSetByUser)) {
					System.out.println(flights[i].toString());
					noResults = false;
				}
			}
		}
		
		if (noResults)
			System.out.println("No search results");
	}
	
	

	
	public static boolean findThisDay(DayOfWeek[] departureDays, DayOfWeek desiredDayOfTheWeek) {

		boolean thisDayIsFound = false;

		for (int i = 0; i < departureDays.length; i++) {
			if (departureDays[i] == desiredDayOfTheWeek)
				thisDayIsFound = true;
		}

		return thisDayIsFound;
	}
	
	
	

	public static boolean detectIfSpecifiedTimeLater(LocalTime scheduledDepartureTime, LocalTime userEnteredtime) {
		
		boolean isLater = false;
		
		if (scheduledDepartureTime.compareTo(userEnteredtime) > 0)
			isLater = true;
		
		return isLater;
	}
}
