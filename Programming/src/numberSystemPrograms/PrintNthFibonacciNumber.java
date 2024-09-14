package numberSystemPrograms;

import java.util.Scanner;

public class PrintNthFibonacciNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int fibonacciNumber = findFibonacci(n);
		System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
		sc.close();
	}

	// Method to find the nth Fibonacci number
	public static int findFibonacci(int n) {
		if (n <= 0) {
			return -1; // Return -1 for invalid input
		}

		int n1 = 0, n2 = 1, nth = 0;
		int i=3;

		if (n == 1) {
			return n1; // The 1st Fibonacci number is 0
		} else if (n == 2) {
			return n2; // The 2nd Fibonacci number is 1
		}

		// Calculate the nth Fibonacci number using a loop
		/* for (int i = 3; i <= n; i++) {
			nth = n1 + n2;
			n1 = n2;
			n2 = nth;
		}

		return nth;
		*/
		while(i<=n) {
			nth = n1+n2;
			n1=n2;
			n2=nth;
			i++;
		}
		return nth;
	}
}

