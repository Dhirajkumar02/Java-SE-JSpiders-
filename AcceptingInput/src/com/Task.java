package com;
import java.util.*;
public class Task {
	static void checkEvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num+" is a even number!");
		}
		else
		{
			System.out.println(num+" is Odd Numer");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i=1; i<=2; i++) {
			System.out.print("Enter Number: ");
			int num = sc.nextInt();
			checkEvenOdd(num); //checkEvenOdd(sc.nextInt());
			
			System.out.println("---------");
		}
		sc.close();
	}

}
