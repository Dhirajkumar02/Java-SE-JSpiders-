package com;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean rs = isPerfectgNumber(n);
		if(rs)
			System.out.println(n+" is a perfect number.");
		else
			System.out.println(n+" is not a perfect number");
		sc.close();
	}

	public static boolean isPerfectgNumber(int n) {
		int sum = 0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0)
				sum = sum + i;
		}
		return sum == n;
	}

}
