package numberSystemPrograms;

import java.util.Scanner;

public class LuckyNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt(); // 1, 3, 7, 13, ...etc
		boolean rs = isLuckyNumber(n);

		if (rs) {
			System.out.println(n + " is a Lucky Number.");
		} else {
			System.out.println(n + " is not a Lucky Number.");
		}
		sc.close();
	}

	public static boolean isLuckyNumber(int n) {
		int count = 2; // Start with removing every second number

		while (count <= n) {
			if (n % count == 0) {
				return false; // If the number is removed, it's not lucky
			}

			// Calculate the next position for this number
			n -= n / count;
			count++;
		}

		return true; // If it survives, it's a Lucky Number
	}
}



