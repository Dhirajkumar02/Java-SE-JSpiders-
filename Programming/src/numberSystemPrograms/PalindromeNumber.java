 package numberSystemPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		boolean rs = checkPalindromeNumber(n);
		if(rs)
			System.out.println(n+ " is a palindrome number.");
		else
		    System.out.println(n+ " is not a palindrome number.");
		sc.close();
	}
	static boolean checkPalindromeNumber(int n) {
		int ans=n;
		int res = 0;
		do {
			int x =n%10;
			res = res*10 + x;
			n =n/10;
		}while(n != 0);
		
		return res == ans;
		
//		if(res == ans) {
//			return true;
//		}else {
//			return false;
//		}

	}

}
