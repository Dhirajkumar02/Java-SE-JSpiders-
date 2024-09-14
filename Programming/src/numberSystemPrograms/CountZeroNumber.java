package com;

import java.util.Scanner;

public class CountZeroNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int count = countZeroNumber(n);
		System.out.println(count);
		sc.close();
	}
	static int countZeroNumber(int n) {
		int count=0;
		do {
			int x =n%10;
			if(x==0)
				count++;
			n=n/10;
		}while(n != 0);

		return count;
	}

}
