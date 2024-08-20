package com;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Infinite loop
		while (true) {
			
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Hi");
				break;
				
			case 2:
				System.out.println("Bye");
				break;
				
			case 3:
				System.out.println("Thank You!");
				sc.close();
				System.exit(0); // Terminate the program (stops the JVM)
				
			default:
				System.out.println("Invalid Choice");
				
			} // end of switch
			
			System.out.println("------------");
			
		} // end the while
	} // end the main class

} // end the class
