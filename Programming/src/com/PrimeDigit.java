package com;

import java.util.Scanner;

public class PrimeDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int rs = primeDigit(n);
		System.out.println(rs);
		sc.close();
	}
	static int primeDigit(int n) {
		int count = 0;
		do {
			int d = n%10;
			if( d == 1 || d == 3 || d == 5 || d == 7)
				count++;
			n = n/10;
		}while( n != 0);
		return count;
	}

}
