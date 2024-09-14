package numberSystemPrograms;

import java.util.Scanner;

public class BiggestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int bigDigit = getBiggestDigit(n);
		System.out.println("The biggest digit from the number is "+bigDigit);
		sc.close();
	}

	public static int getBiggestDigit(int n) {
		int big = -9;
		do {
			int d = n%10;
			if(d > big) 
				big = d;
			n =n/10;
		}while(n != 0);
		return big;
	}

}
