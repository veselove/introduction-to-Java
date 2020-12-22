package by.epam.module04.agregation_composition.task5;

import java.util.Objects;

public class Voucher {

	enum TourType {

		BEACH("beach"), 
		EXCURSION("excursion"), 
		SHOP("shop"), 
		CHILDRENS("children's");

		private String type;

		TourType(String type) {
			this.type = type;
		}

	}

	enum Transport {

		AIRCRAFT("aircraft"), 
		BUS("bus"), 
		TRAIN("train");

		private String type;

		Transport(String type) {
			this.type = type;
		}

	}

	enum Food {

		NOT_INCLUDED("not included"),
		BREAKFAST("nreakfast"), 
		ALL_INCLUSIVE("all inclusive");

		private String type;

		Food(String type) {
			this.type = type;
		}
	}

	private String country;
	private String city;
	private TourType tourType;
	private int numberOfDays;
	private Food food;
	private String departureCity;
	private Transport transport;
	private double voucherCost;

	public Voucher(String country, String city, TourType tourType, int numberOfDays, Food food,
			String departureCity, Transport transport, double voucherCost) {

		this.country = country;
		this.city = city;
		this.setTourType(tourType);
		this.numberOfDays = numberOfDays;
		this.food = food;
		this.departureCity = departureCity;
		this.transport = transport;
		this.voucherCost = voucherCost;
	}
	

	public TourType getTourType() {
		return tourType;
	}
	
	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}
	
	public Transport getTransport() {
		return transport;
	}
	
	public Food getFood() {
		return food;
	}
	
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public double getCost() {
		return voucherCost;
	}

	
	public String getVoucherInfo() {
		return "Country: " + country + " | City: " + city + 
				" | Type: " + getTourType().type + " | Number of days: " + numberOfDays +
				" | Food: " + food.type + " | Departure city: " + departureCity + 
				" | Transport: " + transport.type + " | Cost: " + voucherCost + " BYN.";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(country, city, tourType, numberOfDays, food,
				departureCity, transport, voucherCost);
	}
	
	@Override
	public boolean equals(Object o ) {
		if (this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Voucher voucher = (Voucher) o;
		return country.equals(voucher.country) &&
				city.equals(voucher.city) &&
				tourType == voucher.tourType &&
				numberOfDays == voucher.numberOfDays &&
				food == voucher.food &&
				departureCity.equals(voucher.departureCity) &&
				transport == voucher.transport &&
				Double.compare(voucher.voucherCost, voucherCost) == 0;
	}

}