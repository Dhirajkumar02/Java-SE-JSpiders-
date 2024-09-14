package com;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean rs = isPrimeNumber(n);
		if(rs)
			System.out.println(n+" is a prime number.");
		else
			System.out.println(n+" is not a prime number");
		sc.close();
	}

	public static boolean isPrimeNumber(int n) {
		if(n==0 || n==1)
			return false;
		int count = 2;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				count++;
		}
		return count == 2;

		/*
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;

		 */
	}
}
