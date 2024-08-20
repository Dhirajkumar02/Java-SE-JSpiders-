package com;

import java.util.Scanner;

public class CalculatorMainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator Project");
		System.out.println("-----------------------------");

		Scanner sc = new Scanner(System.in); // To accept input from the user


		Calculator calc = new CalculatorImpl(); // Upcasting->Abstraction

		// Infinite loop
		while(true) {

			// Menu driven program
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication");
			System.out.println("4.Division\n5.Exit\nEnter Choice: ");
			int choice = sc.nextInt();


			/*	if (choice == 5) {
				System.out.println("Thank You!");
				break;
			}

			if (choice < 1 || choice > 5) {
				System.out.println("Invalid Choice");
				continue;
			}

			System.out.print("Enter 2 numbers: ");
			int x = sc.nextInt();
			int y = sc.nextInt();

			switch (choice) {
			case 1 -> calc.add(x, y);  // '->' switch expression or arrow case labels (java 12 ) benefits of using '->' The code is more readable and concise. 
			case 2 -> calc.sub(x, y);
			case 3 -> calc.mul(x, y);
			case 4 -> calc.div(x, y);
			}
		}
			sc.close();
        /*

			/** 
			 * - x  and y are local variable & local variable do not have default values.
			 * - hence initializing to 0.
			 */

			int x = 0;
			int y = 0;

			// Accepting input when choice is 1, 2, 3 & 4
			if(choice >= 1 && choice <= 4) {
				System.out.print("Enter 2 number: ");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			switch (choice) {

			case 1: 
				calc.add(x, y);
				break;

			case 2:
				calc.sub(x, y);
				break;

			case 3:
				calc.mul(x, y);
				break;

			case 4: 
				calc.div(x, y);
				break;

			case 5: 
				System.out.println("Thank You!");
				sc.close();
				System.exit(0);

			default:
				System.out.println("Invalid Choice");

			} // end the switch statement

		} // end the while loop

	} // end the main class

} // end the calculator main class
