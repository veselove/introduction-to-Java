package by.epam.module04.agregation_composition.task5;

import java.util.ArrayList;
import java.util.Objects;

public class TravelAgency {

	private String name;
	private ArrayList<Voucher> vouchers;

	public TravelAgency(String name) {
		this.name = name;
		vouchers = new ArrayList<>();
	}

	public TravelAgency(String name, ArrayList<Voucher> vouchers) {
		this.name = name;
		this.vouchers = vouchers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Voucher> getVouchers() {
		return vouchers;
	}

	public void addVoucher(Voucher voucher) {
		vouchers.add(voucher);
	}

	public void setVouchers(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TravelAgency agency = (TravelAgency) o;
		return name.equals(agency.name) &&
				Objects.equals(vouchers,  agency.vouchers);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, vouchers);
	}
	
}
