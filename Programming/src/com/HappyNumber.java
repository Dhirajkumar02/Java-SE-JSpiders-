package com;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		boolean rs = getHappyNumber(n);
		if(rs)
			System.out.println(n+" is a happy number");
		else 
			System.out.println(n+" is not a happy number");
	}

	static boolean getHappyNumber(int n) {
		while(n>9) {
			int sum=0;
			do {
				int d=n%10;
				sum =sum+d*d;
				n=n/10;
			}while(n !=0);
			n=sum;
		}
		return n == 1 || n == 7;
	}
}
