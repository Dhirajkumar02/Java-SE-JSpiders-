package com;

public class FibonacciSequence {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3;
		int count = 10;

		System.out.println("First 10 Fibonacci numbers:");

		// Print the first two Fibonacci numbers
		System.out.print(n1 + " " + n2 + " ");

		// Loop to calculate the next Fibonacci numbers
		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
}

