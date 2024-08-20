package com;

import java.util.Scanner;

public class XylemOrPhloemNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		String res = checkXylemNumber(n);
		System.out.println(n+" is a"+res);
	}
	static String checkXylemNumber(int n) {
		int es=0, ms=0, t=n;
		do {
			int d=n%10;
			if(t==n || n==d) 
				es=es+d;
			else 
				ms=ms+d;
			n /=10;	
		}while(n != 0);
		if(es==ms)
			return "Xylem";
		else
			return "Phloem";
	}
	// Method -> 2
	/* static String checkXylemNumber(int n) {
		int rs=0, ms=0;
		es = es + n%10;
		n = n%10;
		while(n > 9) {
			ms = ms+n%10; 
			n = n/10;
		}
		es =es+n;
		if(es==ms)
			return "Xylem";
		else
			return "Phloem";
	}
	*/

}
