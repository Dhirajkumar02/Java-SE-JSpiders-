package numberSystemPrograms;

import java.util.Scanner;

public class NeonNumber {
	/*
	 * A Neon Number is a number where the sum of the digits of its square
	 *  equals the original number itself. 
	 *  example- 9  -> 9^2 = 81 and 81 -> 8+1 = 9 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		boolean rs = isNeonNumber(n);

		if (rs) {
			System.out.println(n + " is a Neon Number.");
		} else {
			System.out.println(n + " is not a Neon Number.");
		}
		sc.close();
	}

	public static boolean isNeonNumber(int n) {
		int square = n * n;
		int sumOfDigits = 0;

		// Calculate the sum of the digits of the square
		while (square > 0) {
			sumOfDigits += square % 10;
			square /= 10;
		}

		// Check if the sum of the digits is equal to the original number
		return sumOfDigits == n;
	}
}
