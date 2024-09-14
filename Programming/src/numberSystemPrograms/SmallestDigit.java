package com;

import java.util.Scanner;

public class SmallestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int smallDigit = getSmallestDigit(n);
		System.out.println("The biggest digit from the number is "+smallDigit);
		sc.close();
	}

	public static int getSmallestDigit(int n) {
		int small = 9;
		do {
			int d = n%10;
			if(d < small) 
				small = d;
			n =n/10;
		}while(n != 0);
		return small;
	}

}
