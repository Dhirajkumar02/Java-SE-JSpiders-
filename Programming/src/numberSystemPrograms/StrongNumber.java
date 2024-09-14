package numberSystemPrograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean rs = isStrongNumber(n);
		if(rs)
			System.out.println(n+" is a strong number.");
		else
			System.out.println(n+" is not a strong number");
		sc.close();
	}
	public static int getFact(int n) {
		int fact = 1;
		while(n>1) {
			fact = fact*n;
			n--;
		}
		return fact;
	}
	public static boolean isStrongNumber(int x) { // 145
		int sum = 0, temp=x;
		do {
			int d = x % 10;
			sum = sum + getFact(d);
			x = x/10;
		}while(x != 0);
		return sum == temp;
	}

}
