package com;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("Enter number: ");
		int p = sc.nextInt();
		int pow = getPow(n, p);
		System.out.println(n+" to the power of "+p+" is "+pow);
		sc.close();
	}
	static int getPow(int n, int p) {
		int prod = 1;
		while(p>0) {
			prod = prod*n;
			p--;
		}
		return prod;
	}

}
