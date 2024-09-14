package numberSystemPrograms;

import java.util.Scanner;

public class EmirpNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		boolean rs =isEmirp(n);
		if(rs) {
			System.out.println(n+" is an Emirp number");
		}
		else {
			System.out.println(n+" is not an Emirp number");
		}
	}
	static int reverse(int n) {
		int res = 0;
		do {
			int x =n%10;
			res = res*10 + x;
			n =n/10;
		}while(n != 0);

		return res;
	}
	static boolean isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%2==0)
				return false;
		}
		return true;
	}

	static boolean isEmirp(int n) {
		return isPrime(n) && isPrime(reverse(n));
	}
}
