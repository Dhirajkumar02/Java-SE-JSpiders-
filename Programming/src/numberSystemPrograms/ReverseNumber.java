package com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int res = reverseNumber(n);
		System.out.println(res);
		sc.close();
	}
	static int reverseNumber(int n) {
		int res = 0;
		do {
			int x =n%10;
			res = res*10 + x;
			n =n/10;
		}while(n != 0);

		return res;
	}

}
