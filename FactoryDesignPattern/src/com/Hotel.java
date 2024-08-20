package com;

import java.util.Scanner;

public class Hotel {
	/** - If the returntype was Pizza, the method can return only pizza object,
	 * - likewise for all the other objects (specialization).
	 * - Therefore , the return type is food, method can return pizza object,
	 * - Burger object & Biryani object (Generalization)
	 */

	static Food orderFood(int choice) {
		if(choice==1) {
			Pizza p =new Pizza();
			return p; // return new Pizza();
		}
		else if(choice == 2) {
			Burger b = new Burger();
			return b; // return new Burger();
		}
		else if(choice == 3) {
			Biryani b = new Biryani();
			return b; // return new Biryani();
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Pizza\n2.Burger\n3.Biryani\nEnter Choice:");
		int choice = sc.nextInt();
		sc.close();
		// If orderFood(1); -> Food obj = new Pizza();
		// If orderFood(2); -> Food obj = new Burger();
		// If orderFood(3); -> Food obj = new Biryani();
		// If orderFood(4); -> Food obj = null;
		Food obj = orderFood(choice);
		if( obj instanceof Pizza) {
			System.out.println("Eating Pizza");
		}
		else if (obj instanceof Burger) {
			System.out.println("Eating Burger");
			
		}
		else if (obj instanceof Biryani ) {
			System.out.println("Eating Biryani");
		}
		else {
			System.out.println("Invalid Choice");
		}
				
	}

}
