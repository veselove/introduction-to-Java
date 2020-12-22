package by.epam.module04.agregation_composition.task5;

import by.epam.module04.agregation_composition.task5.Voucher.Food;
import by.epam.module04.agregation_composition.task5.Voucher.TourType;
import by.epam.module04.agregation_composition.task5.Voucher.Transport;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Task5 {

	public static void main(String[] args) {

		TravelAgency travelAgency001 = new TravelAgency("Star-Travel");
		
		Client client001 = new Client("Petrov", "Pavel", "Viktorovich");

		Voucher voucher1 = new Voucher("Egypt", "Hurghada", Voucher.TourType.BEACH, 7, Voucher.Food.ALL_INCLUSIVE,
				"Gomel", Voucher.Transport.AIRCRAFT, 781.89);
		Voucher voucher2 = new Voucher("Poland", "Belostok", Voucher.TourType.SHOP, 1, Voucher.Food.NOT_INCLUDED,
				"Minsk", Voucher.Transport.BUS, 70);
		Voucher voucher3 = new Voucher("Poland", "Warsaw", Voucher.TourType.SHOP, 1, Voucher.Food.NOT_INCLUDED, 
				"Brest", Voucher.Transport.BUS, 35);
		Voucher voucher4 = new Voucher("Turkey", "Kemer", Voucher.TourType.BEACH, 9, Voucher.Food.ALL_INCLUSIVE,
				"Minsk", Voucher.Transport.AIRCRAFT, 1255.01);
		Voucher voucher5 = new Voucher("Turkey", "Bodrum", Voucher.TourType.BEACH, 7, Voucher.Food.ALL_INCLUSIVE,
				"Minsk", Voucher.Transport.AIRCRAFT, 1061.59);
		Voucher voucher6 = new Voucher("Russia", "Moscow", Voucher.TourType.EXCURSION, 2, Voucher.Food.BREAKFAST,
				"Minsk", Voucher.Transport.BUS, 205.88);
		Voucher voucher7 = new Voucher("Ukraune", "Odessa", Voucher.TourType.BEACH, 7, Voucher.Food.ALL_INCLUSIVE,
				"Minsk", Voucher.Transport.TRAIN, 765);
		Voucher voucher8 = new Voucher("Ukraine", "Kiev", Voucher.TourType.EXCURSION, 2, Voucher.Food.BREAKFAST,
				"Minsk", Voucher.Transport.BUS, 178);
		Voucher voucher9 = new Voucher("Ukraine", "Chernigov", Voucher.TourType.SHOP, 1, Voucher.Food.NOT_INCLUDED,
				"Gomel", Voucher.Transport.BUS, 25.5);
		Voucher voucher10 = new Voucher("Egypt", "Sharm El Sheikh", Voucher.TourType.BEACH, 9,
				Voucher.Food.ALL_INCLUSIVE, "Minsk", Voucher.Transport.AIRCRAFT, 982.16);

		travelAgency001.addVoucher(voucher1);
		travelAgency001.addVoucher(voucher2);
		travelAgency001.addVoucher(voucher3);
		travelAgency001.addVoucher(voucher4);
		travelAgency001.addVoucher(voucher5);
		travelAgency001.addVoucher(voucher6);
		travelAgency001.addVoucher(voucher7);
		travelAgency001.addVoucher(voucher8);
		travelAgency001.addVoucher(voucher9);
		travelAgency001.addVoucher(voucher10);

		System.out.println("View all offers of travel agency: ");
		AgencyLogic.viewAllVouchers(travelAgency001.getVouchers());

		System.out.println("\nSearch for tours by 4 specified parameters:\n\n1. To the sea;");
		AgencyLogic.sortByType(travelAgency001.getVouchers(), TourType.BEACH);
		AgencyLogic.viewAllVouchers(travelAgency001.getVouchers());

		System.out.println("\n2. With air travel;");
		AgencyLogic.sortByTransport(travelAgency001.getVouchers(), Transport.AIRCRAFT);
		AgencyLogic.viewAllVouchers(travelAgency001.getVouchers());

		System.out.println("\n3. From 8 to 10 days;");
		AgencyLogic.sortByQttDays(travelAgency001.getVouchers(), 8, 10);
		AgencyLogic.viewAllVouchers(travelAgency001.getVouchers());

		System.out.println("\n4. With all-inclusive meals.");
		AgencyLogic.sortByFood(travelAgency001.getVouchers(), Food.ALL_INCLUSIVE);
		AgencyLogic.viewAllVouchers(travelAgency001.getVouchers());

		System.out.println("\nResults sorted by price:");
		AgencyLogic.sortByPrice(travelAgency001.getVouchers());
		AgencyLogic.viewAllVouchers(travelAgency001.getVouchers());
		
		client001.setSelectedVoucher(travelAgency001.getVouchers(), 0);
		
		System.out.println("\nThe voucher chosen by the client:");
		AgencyLogic.viewVoucher(client001.getSelectedVoucher());

	}

}
