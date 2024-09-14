package numberSystemPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		boolean rs =isArmstrong(n);
		if(rs) {
			System.out.println(n+" is an armstrong number");
		}
		else {
			System.out.println(n+" is not an armstrong number");
		}
		
		sc .close();

	}

	static int isPow(int n, int p) {
		int prod = 1;
		while(p>0) {
			prod =prod*n;
			p--;
		}
		return prod;
	}
	static int countDigit(int x) {
		int count = 0;
		do {
			count++;
			x=x/10;
		}while( x != 0);
		return count;
	}
	static boolean isArmstrong(int x) {
		int sum=0, temp=x;
		int dc=countDigit(x);
		do {
			int d=x%10;
			sum=sum+isPow(d, dc);
			x=x/10;

		}while(x != 0);
		return sum==temp;
	}

}
