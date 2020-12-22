package by.epam.module04.agregation_composition.task4;

public class BankAccount {

	private String accountNumber;
	private String accountCurrency;
	private double accountBalance;
	private boolean isBlocked;

	public BankAccount(String accountNumber, String accountCurrency, double accountBalance, boolean isBlocked) {
		this.accountNumber = accountNumber;
		this.accountCurrency = accountCurrency;
		this.accountBalance = accountBalance;
		this.isBlocked = isBlocked;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
}
