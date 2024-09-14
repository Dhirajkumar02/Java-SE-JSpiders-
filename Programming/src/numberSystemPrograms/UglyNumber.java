package com;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (isUglyNumber(n)) {
			System.out.println(n + " is an Ugly Number.");
		} else {
			System.out.println(n + " is not an Ugly Number.");
		}
		sc.close();
	}

	public static boolean isUglyNumber(int n) {
		if (n <= 0) {
			return false; // Ugly numbers are positive
		}

		// Remove all factors of 2 , 3 , 5
		while (n != 1) {
			if(n % 2==0) {
				n /= 2;
			}
			else if (n%3==0) {
				n /= 3;
			}
			else if(n%5==5) {
				n /=5;
			}
			else {
				break;
			}

		}

		// If the remaining number is 1, then it was only divisible by 2, 3, and 5
		return n == 1;
	}
}

