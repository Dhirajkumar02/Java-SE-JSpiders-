package numberSystemPrograms;

import java.util.Scanner;

public class AutomorphicNumber {

	// Method to find the biggest number among four integers
	public static int biggest(int a, int b, int c, int d) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		return max;
	}

	// Method to calculate 10 raised to the power of n (10^n) without using Math.pow
	public static int powerOfTen(int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= 10;
		}
		return result;
	}

	// Method to check if a number is an automorphic number
	public static boolean isAutomorphic(int num) {
		int square = num * num;
		int temp = num;

		// Count the number of digits in the original number
		int numDigits = 0;
		while (temp > 0) {
			numDigits++;
			temp /= 10;
		}

		// Calculate 10^numDigits without using Math.pow
		int divisor = powerOfTen(numDigits);

		// Extract the last digits of the square corresponding to the number of digits in the original number
		int lastDigits = square % divisor;

		return lastDigits == num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		// Finding the biggest number among four integers
		int biggestNumber = biggest(a, b, c, d);
		System.out.println("The biggest number is: " + biggestNumber);

		// Checking if the biggest number is an automorphic number
		if (isAutomorphic(biggestNumber)) {
			System.out.println(biggestNumber + " is an automorphic number.");
		} else {
			System.out.println(biggestNumber + " is not an automorphic number.");
		}
		sc.close();
	}
}
