package numberSystemPrograms;

import java.util.Scanner;

public class TechNumber {

	public static boolean isTechNumber(int n) {
		int temp = n;
		int digitCount = 0;

		// Count the number of digits
		while (temp > 0) {
			digitCount++;
			temp /= 10;
		}

		// Check if the number has an even number of digits
		if (digitCount % 2 != 0) {
			return false;
		}

		// Split the number into two equal parts
		int d = (int) Math.pow(10, digitCount / 2);
		int firstHalf = n / d;
		int secondHalf = n % d;

		// Calculate the sum of the two halves
		int sum = firstHalf + secondHalf;

		// Check if the square of the sum equals the original number
		return (sum * sum) == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt(); // 81, 2025 
		if (isTechNumber(num)) {
			System.out.println(num + " is a Tech number.");
		} else {
			System.out.println(num + " is not a Tech number.");
		}
		sc.close();
	}
}
