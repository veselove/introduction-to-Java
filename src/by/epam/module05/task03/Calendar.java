package by.epam.module05.task03;

import java.util.ArrayList;
import java.util.Objects;

public class Calendar {

	private ArrayList<Date> calendar;
	private int year;

	public Calendar() {

		ArrayList<Date> calendar = new ArrayList<>();
		this.setCalendar(calendar);

	}

	public Calendar(int year) {

		ArrayList<Date> calendar = new ArrayList<>();
		this.setCalendar(calendar);
		this.year = year;

	}

	public ArrayList<Date> getCalendar() {
		return calendar;
	}

	public void setCalendar(ArrayList<Date> calendar) {
		this.calendar = calendar;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void addDate(int day, int month, boolean isDayOff, boolean isHoliday) {
		getCalendar().add(new Date(day, month, isDayOff, isHoliday));
	}

	public void showHolidays(ArrayList<Date> calendar) {
		System.out.println("List of holidays:");
		for (int i = 0; i < calendar.size(); i++) {
			if (calendar.get(i).isHoliday) {
				System.out.println(calendar.get(i));
			}
		}
	}

	public class Date {

		private int day;
		private int month;
		private boolean isDayOff;
		private boolean isHoliday;

		public Date() {
		}

		public Date(int day, int month, boolean isDayOff, boolean isHoliday) {
			this.day = day;
			this.month = month;
			this.isDayOff = isDayOff;
			this.isHoliday = isHoliday;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public boolean isDayOff() {
			return isDayOff;
		}

		public void setDayOff(boolean isDayOff) {
			this.isDayOff = isDayOff;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Date date = (Date) obj;
			return day == date.day && month == date.month && Objects.equals(isDayOff, date.isDayOff)
					&& Objects.equals(isHoliday, date.isHoliday);

		}

		@Override
		public int hashCode() {
			return Objects.hash(day, month, isDayOff, isHoliday);
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder(day + "." + month + "." + year + ", ");
			if (isDayOff) {
				builder.append("weekend, ");
			} else {
				builder.append("working day, ");
			}
			if (isHoliday) {
				builder.append("it's a holiday.");
			} else {
				builder.append("no holiday.");
			}
			return builder.toString();
		}

	}

}
