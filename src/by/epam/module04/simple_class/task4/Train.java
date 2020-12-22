package by.epam.module04.simple_class.task4;

public class Train {

	private String destination;
	private int trainNumber;
	private int hours;
	private int minutes;

	public Train(String destination, int trainNumber, int hours, int minutes) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.hours = hours;
		this.minutes = minutes;
	}

	String getDestination() {
		return destination;
	}

	int getTrainNumber() {
		return trainNumber;
	}

	int getHours() {
		return hours;
	}

	int getMinutes() {
		return minutes;
	}

	public void viewTrainInfo() {

		StringBuilder builder = new StringBuilder();
		builder.append((this.destination + ", " + this.trainNumber + ", " + this.hours + ":"));

		if (minutes == 0)
			builder.append("0");

		builder.append(minutes);

		System.out.println(builder.toString());
	}

}
