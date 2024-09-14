package numberSystemPrograms;

import java.util.Scanner;

public class BuzzNumber {

	public static boolean isBuzzNumber(int n) {
		// Check if the number is divisible by 7 or ends with 7
		return (n % 7 == 0) || (n % 10 == 7);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt(); // 7, 14, 28, 37, 49, 
		boolean rs = isBuzzNumber(n);
		if (rs) {
			System.out.println(n+ " is a Buzz number.");
		} else {
			System.out.println(n+ " is not a Buzz number.");
		}
		sc.close();
	}
}
