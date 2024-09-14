package numberSystemPrograms;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		sc.close();
		boolean rs = checkHarshadNumber(n);
		if(rs) {
			System.out.println(n+" is a harshad number");
		}
		else {
			System.out.println(n+" is not a harshad number");
		}
	}
	static boolean checkHarshadNumber(int n) {
		int sum=0, x=n;
		do {
			int d=n%10;
			sum +=d;
			n /=10;	
		}while(n != 0);
		if(x % sum == 0)
			return true;
		else
			return false;
	}

}
