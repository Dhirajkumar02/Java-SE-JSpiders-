package com;

import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		double avg = averageDigitNumber(n);
		System.out.println(avg);
		sc.close();
	}
	static double averageDigitNumber(int n) {
		int count=0;
		double avg =0;
		do {
			int x =n%10;
			avg +=x;
			count++;
			n=n/10;
		}while(n != 0);

		return avg/count;
	}

}
