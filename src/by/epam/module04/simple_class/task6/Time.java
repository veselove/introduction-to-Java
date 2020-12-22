package by.epam.module04.simple_class.task6;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;

	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		if (minutes > 59 || minutes < 0)
			this.minutes = 0;
		else
			this.minutes = minutes;
	}

	public void setSeconds(int seconds) {
		if (seconds > 59 || seconds < 0)
			this.seconds = 0;
		else
			this.seconds = seconds;
	}

	int getHours() {
		return hours;
	}

	int getMinutes() {
		return minutes;
	}

	int getSeconds() {
		return seconds;
	}

}
