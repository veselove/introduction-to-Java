package by.epam.module05.task03;

public class Main {

	public static void main(String[] args) {

		Calendar calendar2020 = new Calendar(2020);
		
		calendar2020.addDate(1, 1, true, true);
		calendar2020.addDate(1, 2, true, false);
		calendar2020.addDate(23, 2, false, true);
		calendar2020.addDate(8, 3, true, true);
		calendar2020.addDate(1, 9, false, true);
		calendar2020.addDate(2, 9, false, false);
		
		
		calendar2020.showHolidays(calendar2020.getCalendar());

	}

}
