package com;

import java.util.Scanner;

public class Amazon {
	static Product order(int choice) {
		if(choice==1) {
			Laptop l =new Laptop();
			return l; // return new Laptop();
		}
		else if(choice == 2) {
			Mobile m = new Mobile();
			return m; // return new Mobile();
		}
		else if(choice == 3) {
			Watch w = new Watch();
			return w; // return new Watch();
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Laptop\n2.Mobile\n3.Watch\nEnter Choice:");
		int choice = sc.nextInt();
		sc.close();
		// If order(1); -> Product obj = new Laptop();
		// If order(2); -> Food obj = new Mobile();
		// If order(3); -> Food obj = new Watch();
		// If order(4); -> Food obj = null;
		Product obj = order(choice);
		if( obj instanceof Laptop) {
			System.out.println("Ordering Laptop");
		}
		else if (obj instanceof Mobile) {
			System.out.println("Ordering Mobile");
			
		}
		else if (obj instanceof Watch ) {
			System.out.println("Ordering Watch");
		}
		else {
			System.out.println("Invalid Choice");
		}
				
	}


}
