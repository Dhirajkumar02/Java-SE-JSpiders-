package day1;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int x = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int y = sc.nextInt();
		sc.close();

		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException E){
			System.out.println("Do not divide by 0");
		}

		System.out.println("End");
	}

}
