package by.epam.module04.agregation_composition.task5;

import java.util.ArrayList;

public class AgencyLogic {

	public static void viewAllVouchers(ArrayList<Voucher> vouchers) {

		for (int i = 0; i < vouchers.size(); i++) {
			System.out.println(vouchers.get(i).getVoucherInfo());
		}
	}
	
	public static void viewVoucher(Voucher voucher) {
		System.out.println(voucher.getVoucherInfo());
	}
	

	public static void sortByType(ArrayList<Voucher> vouchers, Voucher.TourType type) {
		
		for (int i = 0; i < vouchers.size(); i++) {
			if (vouchers.get(i).getTourType() != type) {
				vouchers.remove(i);
				i--;
			}
		}
	}
	

	public static void sortByTransport(ArrayList<Voucher> vouchers, Voucher.Transport transport) {
		
		for (int i = 0; i < vouchers.size(); i++) {
			if (vouchers.get(i).getTransport() != transport) {
				vouchers.remove(i);
				i--;
			}
		}
	}
	

	public static void sortByFood(ArrayList<Voucher> vouchers, Voucher.Food food) {
		
		for (int i = 0; i < vouchers.size(); i++) {
			if (vouchers.get(i).getFood() != food) {
				vouchers.remove(i);
				i--;
			}
		}
	}
	

	public static void sortByQttDays(ArrayList<Voucher> vouchers, int qttDaysFrom, int qttDaysTo) {
		
		for (int i = 0; i < vouchers.size(); i++) {
			if (vouchers.get(i).getNumberOfDays() < qttDaysFrom | vouchers.get(i).getNumberOfDays() > qttDaysTo) {
				vouchers.remove(i);
				i--;
			}
		}
	}
	

	public static void sortByPrice(ArrayList<Voucher> vouchers) {

		for (int i = 0; i < vouchers.size(); i++) {
			for (int j = 1; j < vouchers.size(); j++) {
				if ((vouchers.get(j - 1)).getCost() > ((vouchers.get(j)).getCost())) {
					swap(vouchers, j - 1, j);
				}
			}
		}

	}

	public static void swap(ArrayList<Voucher> vouchers, int a, int b) {

		Voucher tmp = vouchers.get(a);
		vouchers.set(a, vouchers.get(b));
		vouchers.set(b, tmp);
	}

}
