package com;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x = sc.nextInt();
		System.out.println("Enter Second number:");
		int y = sc.nextInt();
		sc.close();

		System.out.println("Sum of "+x+" & "+y+" is "+(x+y));
	}

}
