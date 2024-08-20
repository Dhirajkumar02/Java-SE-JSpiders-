package com;

import java.util.Scanner;

public class Cafe {
	static Beverage order(int choice) {
		if(choice==1) {
			return new Beer();
		}
		else if (choice == 2) {
			return new Vodka();
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Beer\n2.Vodka\nEnter Choice: ");
		int choice = sc.nextInt();
		sc.close();
		
		// Beverage obj = new Beer(); or new Vodka(); or null;
		Beverage obj = order(choice);
		if(obj instanceof Beer) {
			System.out.println("Drinking Beer");
		}
		else if (obj instanceof Vodka) {
			System.out.println("Drinking Vodka");
		}
		else {
			System.out.println("Drinking Milk");
		}
	}

}

/* Note: 
 * Factory design pattern is a process of 1 method returning different type of
 * objects, we achieve it using generalization
 */

