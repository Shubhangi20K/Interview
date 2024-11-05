package com.multi;

public class BankAccount {

	static String BankName = "Bank Of America";
	String AccountHolderName;
	String AccountNumber;
	float Balance;
	public static void main(String[] args) {
		double LoanInterestRate = 7.5;
		System.out.println(LoanInterestRate);
		System.out.println(BankAccount.BankName);
		BankAccount Bank = new BankAccount();
		Bank.AccountHolderName = "shubhangi";
		Bank.AccountNumber ="123456789";
		Bank.Balance =5124364f;
		System.out.println(Bank.Balance);
		
	}
}
