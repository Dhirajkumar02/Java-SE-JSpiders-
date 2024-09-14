package customexception;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 20000;
		System.out.println("Enter amount to be withdrawn:");
		int amount =sc.nextInt();
		sc.close();
		if(amount <= balance) {
			System.out.println("Amount withdrawn successfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient Balance");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
