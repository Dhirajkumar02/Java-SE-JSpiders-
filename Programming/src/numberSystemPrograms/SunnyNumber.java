package numberSystemPrograms;

import java.util.Scanner;

public class SunnyNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (isSunnyNumber(n)) {
			System.out.println(n + " is a Sunny Number.");
		} else {
			System.out.println(n + " is not a Sunny Number.");
		}
		sc.close();
	}

	public static boolean isSunnyNumber(int number) {
		int nextNumber = number + 1;

		// Check if nextNumber is a perfect square
		int i = 1;
		while (i * i <= nextNumber) {
			if (i * i == nextNumber) {
				return true;
			}
			i++;
		}

		return false;
	}
}
