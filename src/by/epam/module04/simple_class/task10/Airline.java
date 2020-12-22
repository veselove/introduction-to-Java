package by.epam.module04.simple_class.task10;

import java.time.LocalTime;
import java.util.Arrays;

public class Airline {

	private String destination;
	private String flightNumber;
	private String aircraftType;
	private LocalTime depTime;
	private DayOfWeek[] departureDays;

	public Airline(String destination, String flightNumber, String aircraftType, LocalTime depTime,
			DayOfWeek[] departureDays) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.depTime = depTime;
		this.departureDays = departureDays;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public void setDepartureTime(LocalTime depTime) {
		this.depTime = depTime;
	}

	public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
		this.departureDays = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public LocalTime getDepartureTime() {
		return depTime;
	}

	public DayOfWeek[] getDaysOfWeek() {
		return departureDays;
	}
	
	
	@Override
	public String toString() {
		return "destination: " + this.destination + ", flight: " + this.flightNumber + ", aircraft type: "
				+ this.aircraftType + ", departure time: " + this.depTime + ", departure days: "
				+ Arrays.toString(departureDays);
	}

}
