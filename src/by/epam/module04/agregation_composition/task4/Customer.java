package by.epam.module04.agregation_composition.task4;

import java.util.ArrayList;

public class Customer {

	private String surname;
	private String name;
	private String patronymic;
	private BankAccount account;
	private ArrayList<BankAccount> customerAccounts;

	public Customer(String surname, String name, String patronymic) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.customerAccounts = new ArrayList<>();
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	
	public void addAccount(BankAccount account) {
		customerAccounts.add(account);
	}


}
