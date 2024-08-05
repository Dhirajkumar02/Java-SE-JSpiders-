package com;
import java.util.*;
public class Addition {

	static void add(int x, int y) {
		int sum = (x+y);
		System.out.println("Sum of "+x+" & "+y+" is "+sum);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.print("Enter first number: ");
			int x = sc.nextInt();
			System.out.print("Enter second number: ");
			int y = sc.nextInt();
			add(x, y);
			System.out.println("------");
		}
		sc.close();
	}

}
