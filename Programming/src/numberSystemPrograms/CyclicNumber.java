package com;

import java.util.Scanner;

public class CyclicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (isCyclicNumber(number)) {
			System.out.println(number + " is a Cyclic Number.");
		} else {
			System.out.println(number + " is not a Cyclic Number.");
		}
		sc.close();
	}

	public static boolean isCyclicNumber(int number) {
		int originalNumber = number;
		int length = getNumberLength(number);
		int rotatedNumber = number;
		int numRotations = length;

		// Generate all rotations and check if they are permutations of the original number
		for (int i = 0; i < numRotations; i++) {
			// Rotate the number
			rotatedNumber = rotateNumber(rotatedNumber, length);

			// Check if the rotated number is a permutation of the original number
			if (!isPermutation(originalNumber, rotatedNumber, length)) {
				return false;
			}
		}

		return true;
	}

	// Get the length of the number
	public static int getNumberLength(int number) {
		int length = 0;
		while (number > 0) {
			length++;
			number /= 10;
		}
		return length == 0 ? 1 : length; // Handle case for 0
	}

	// Rotate the number by moving the last digit to the front
	public static int rotateNumber(int number, int length) {
		int lastDigit = number % 10;
		number /= 10;
		int rotatedNumber = lastDigit * (int) Math.pow(10, length - 1) + number;
		return rotatedNumber;
	}

	// Check if two numbers are permutations of each other
	public static boolean isPermutation(int num1, int num2, int length) {
		int[] count1 = new int[10];
		int[] count2 = new int[10];

		// Count digits in num1
		while (num1 > 0) {
			count1[num1 % 10]++;
			num1 /= 10;
		}

		// Count digits in num2
		while (num2 > 0) {
			count2[num2 % 10]++;
			num2 /= 10;
		}

		// Compare digit counts
		for (int i = 0; i < 10; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}

		return true;
	}
}


