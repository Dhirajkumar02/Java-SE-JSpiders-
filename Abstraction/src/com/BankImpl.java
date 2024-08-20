package com;

public class BankImpl implements Bank {
	int balance = 5000;
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing ₹"+amount);
		balance += amount;
		System.out.println("Amount deposited successfully");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing ₹"+amount);
		balance -= amount;
		System.out.println("Amount withdrawn successfully");
	}
	public void checkBalance() {
		System.out.println("Available Balance: ₹"+balance);
	}

}
