package by.epam.module04.simple_class.task8;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String cardNumber;
	private String bankAccountNumber;

	public Customer(int id, String surname, String name, String patronymic, String address, String cardNumber,
			String bankAccountNumber) {

		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankAccountNumber = bankAccountNumber;

	}

	public int getID() {
		return this.id;
	}

	public String getSurname() {
		return this.surname;
	}

	public String getName() {
		return this.name;
	}

	public String getPatronymic() {
		return this.patronymic;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	@Override
	public String toString() {
		return this.id + this.surname + this.name + this.patronymic + this.address + this.cardNumber
				+ this.bankAccountNumber;
	}
}
