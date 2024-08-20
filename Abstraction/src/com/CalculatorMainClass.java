package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator calc = new CalculatorImpl(); // Rules-4 -> Upcasting
		
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		calc.add(x, y);
		calc.mul(x, y);
	}

}
