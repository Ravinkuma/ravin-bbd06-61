package com.java.coding.practice61;

public class BankAccount {
	private long accountNo;
	private double balance;
	public BankAccount(long accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "BankAccount Details: accountNumber=" + accountNo + ", balance=" + balance;
	}

}
