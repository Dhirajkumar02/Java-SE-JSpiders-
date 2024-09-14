package com;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n = sc.nextLong(); // 12021, 2012014
		boolean rs = isDuckNumber(n);

		if (rs) {
			System.out.println(n + " is a Duck Number.");
		} else {
			System.out.println(n + " is not a Duck Number."); // 00121
		}
		sc.close();
	}

	public static boolean isDuckNumber(long n) {
		// Handle leading zero
		if (n == 0) {
			return false;
		}

		// Remove leading zeroes
		while (n > 0 && n % 10 == 0) {
			n /= 10;
		}

		// Check for zero in the remaining digits
		while (n > 0) {
			if (n % 10 == 0) {
				return true;
			}
			n /= 10;
		}

		return false;
	}
}

