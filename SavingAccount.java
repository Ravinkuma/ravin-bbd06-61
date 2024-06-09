package com.java.coding.practice61;

public class SavingAccount extends BankAccount {
	double interestRate;

	public SavingAccount(long accountNo, double balance, double interestRate) {
		super(accountNo, balance);
		this.interestRate = interestRate;
	}

	
	@Override
	public String toString() {
		return "SavingsAccount Details: accountNumber=" + getAccountNo() + ", balance=" + getBalance() + ", interestRate=" + interestRate;
	}

}
