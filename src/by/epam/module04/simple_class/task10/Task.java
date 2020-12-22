package by.epam.module04.simple_class.task10;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.time.LocalTime;

public class Task {

	public static void main(String[] args) {
		
		final int databaseSize = 10;
		
		Airline[] flights = new Airline[databaseSize];
		
		flights[0] = new Airline("Kiev", "B2 867", "Embraer 195", LocalTime.of(9, 30), new DayOfWeek[] {DayOfWeek.Monday, DayOfWeek.Wednesday, DayOfWeek.Friday});
		flights[1] = new Airline("Prague", "B2 861", "Embraer 175", LocalTime.of(12, 20), new DayOfWeek[] {DayOfWeek.Monday, DayOfWeek.Wednesday, DayOfWeek.Friday });
		flights[2] = new Airline("Odessa", "B2 833", "Embraer 175", LocalTime.of(23, 40), new DayOfWeek[] {DayOfWeek.Friday });
		flights[3] = new Airline("Tirana", "B2 8383", "Boeing 737-800", LocalTime.of(16, 25), new DayOfWeek[] {DayOfWeek.Thursday });
		flights[4] = new Airline("Hurghada", "B2 9207", "Boeing 737-800", LocalTime.of(4, 05), new DayOfWeek[] {DayOfWeek.Friday });
		flights[5] = new Airline("Moscow", "B2 802", "Boeing 737-800", LocalTime.of(12, 35), new DayOfWeek[] {DayOfWeek.Monday, DayOfWeek.Wednesday, DayOfWeek.Thursday, DayOfWeek.Friday, DayOfWeek.Sunday });
		flights[6] = new Airline("Kiev", "B2 868", "Embraer 195", LocalTime.of(13, 30), new DayOfWeek[] {DayOfWeek.Monday, DayOfWeek.Wednesday, DayOfWeek.Friday });
		flights[7] = new Airline("Helsinki", "B2 857", "Boeing 737-300", LocalTime.of(14, 30), new DayOfWeek[] {DayOfWeek.Thursday, DayOfWeek.Sunday });
		flights[8] = new Airline("Moscow", "B2 803", "Boeing 737-800", LocalTime.of(22, 40), new DayOfWeek[] {DayOfWeek.Monday, DayOfWeek.Saturday });
		flights[9] = new Airline("Antalya", "B2 8105", "Boeing 737-800", LocalTime.of(5, 0), new DayOfWeek[] {DayOfWeek.Wednesday, DayOfWeek.Friday, DayOfWeek.Saturday, DayOfWeek.Sunday });
	
			
		AirlineLogic.viewFlightsToTheSelectedDestination(flights, "Kiev");
		
		AirlineLogic.viewFlightsToTheSelectedDayOfWeek(flights, DayOfWeek.Sunday);
		
		AirlineLogic.viewFlightsToTheSelectedDayOfWeekAndTime(flights, DayOfWeek.Sunday, LocalTime.of(10, 30));

	}

}
