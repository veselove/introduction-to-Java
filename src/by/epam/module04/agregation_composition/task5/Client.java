package by.epam.module04.agregation_composition.task5;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
	
	private String name;
	private String surname;
	private String patronymic;
	private Voucher selectedVoucher;
	
	public Client (String name, String surname, String patronymic) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public Voucher getSelectedVoucher() {
		return selectedVoucher;
	}

	public void setSelectedVoucher(ArrayList<Voucher> vouchers, int i) {
		this.selectedVoucher = vouchers.get(i);
	}
	
	

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return  name.equals(client.name) &&
                surname.equals(client.surname) &&
                patronymic.equals(client.patronymic);
                
    }
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(name, surname, patronymic, selectedVoucher);
	    }

}
