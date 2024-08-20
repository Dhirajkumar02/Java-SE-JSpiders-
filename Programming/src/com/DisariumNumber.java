package com;

import java.util.Scanner;

public class DisariumNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();

		boolean rs = isDisarium(n);  // 89, 135, 175
		if(rs) {
			System.out.println(n+" is a disarium number");
		}
		else {
			System.out.println(n+"is not a Disarium number");
		}
		sc.close();
	}

	static int countDigits(int x) {
		int count = 0;
		do {
			count++;
			x=x/10;
		}while( x != 0);
		return count;
	}
	static int getPow(int n, int p) {
		int pw = 1;
		while(p>0) {
			pw =pw*n;
			p--;
		}
		return pw;
	}
	static boolean isDisarium(int x) {
		int sum=0, temp=x;
		int dc=countDigits(x);
		do {
			int d=x%10;
			sum=sum+getPow(d, dc);
			dc--;
			x=x/10;

		}while(x != 0);

		return sum==temp;
	}

}
