package by.epam.module04.agregation_composition.task4;

import java.util.ArrayList;

public class AccountLogic {

	public static void searchAccountByNumber(ArrayList<BankAccount> customerAccount, String accNumber) {

		boolean noResult = true;

		for (int i = 0; i < customerAccount.size(); i++) {
			if ((customerAccount.get(i)).getAccountNumber() == accNumber) {
				viewAccountInfo(customerAccount.get(i));
				noResult = false;
			}
		}

		if (noResult)
			System.out.println("No search result");

	}

	public static void sortingAccountsByNumbers(ArrayList<BankAccount> customerAccounts) {

		for (int i = 0; i < customerAccounts.size(); i++) {
			for (int j = 1; j < customerAccounts.size(); j++) {
				if ((customerAccounts.get(j - 1)).getAccountNumber()
						.compareTo((customerAccounts.get(j)).getAccountNumber()) > 0) {
					swap(customerAccounts, j - 1, j);
				}
			}
		}

	}
	
	public static void swap(ArrayList<BankAccount> customerAccounts, int a, int b) {
		BankAccount tmp = customerAccounts.get(a);
		customerAccounts.set(a, customerAccounts.get(b));
		customerAccounts.set(b, tmp);
	}

	public static void viewAllAccounts(ArrayList<BankAccount> customerAccounts) {

		for (int i = 0; i < customerAccounts.size(); i++) {
			viewAccountInfo(customerAccounts.get(i));
		}

	}

	public static void calcTheTotalAmountPos(ArrayList<BankAccount> customerAccounts) {

		double sum = 0.0;

		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountBalance() > 0.0)
				sum += customerAccounts.get(i).getAccountBalance();
		}

		System.out.println("The total is " + sum + " " + customerAccounts.get(0).getAccountCurrency());
	}

	public static void calcTheTotalAmountNeg(ArrayList<BankAccount> customerAccounts) {

		double sum = 0.0;

		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountBalance() < 0.0)
				sum += customerAccounts.get(i).getAccountBalance();
		}

		System.out.println("The total is " + sum + " " + customerAccounts.get(0).getAccountCurrency());
	}

	public static void viewAccountInfo(BankAccount account) {

		StringBuilder builder = new StringBuilder();

		builder.append(account.getAccountNumber() + ", account balance: " + account.getAccountBalance() + " "
				+ account.getAccountCurrency() + ", status: ");

		if (account.getIsBlocked()) {
			builder.append("blocked.");
		} else
			builder.append("no blocking.");
		System.out.println(builder.toString());
	}
	
	public static void blockAccount(BankAccount account) {
		account.setIsBlocked(true);
	}
	
	public static void unblockAccount(BankAccount account) {
		account.setIsBlocked(false);
	}



}
