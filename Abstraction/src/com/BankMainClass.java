package com;

import java.util.Scanner;

public class BankMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Bank b = new BankImpl(); // Upcasting

		b.checkBalance();

		System.out.println("-------");

		System.out.println("Enter amount to be deposited: ");
		int amountToDeposit = sc.nextInt();
		b.deposit(amountToDeposit);
		b.checkBalance();
		System.out.println("--------");

		System.out.println("Enter amount to be withdrawn: ");
		int withdrawAmount = sc.nextInt();
		b.withdraw(withdrawAmount);
		b.checkBalance();

		sc.close();

	}

}
