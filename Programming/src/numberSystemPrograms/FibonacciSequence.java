package numberSystemPrograms;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int count = sc.nextInt();

		int n1 = 0, n2 = 1, n3;

		if (count <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			System.out.println("First " + count + " Fibonacci numbers:");

			// Print the first Fibonacci number
			System.out.print(n1);

			if (count > 1) {
				System.out.print(" " + n2);
			}

			// Initialize a counter starting at 2 (since the first two numbers are already printed)
			int i = 2;

			// Loop to calculate the next Fibonacci numbers
			while (i <= count) {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
				i++;
			}

			/*for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            }
			 */
		}

		sc.close();
	}
}




