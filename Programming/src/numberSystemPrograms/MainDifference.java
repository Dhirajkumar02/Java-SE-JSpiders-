package numberSystemPrograms;

import java.util.Scanner;

public class MainDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int ans = getDiffEvenSumAndOddSum(n);
		System.out.println(ans);
		sc.close();
	}

	static int getDiffEvenSumAndOddSum(int n) {
		int even = 0;
		int odd = 0;
		do {
			int x = n % 10;
			if(x % 2 == 0)
				even += x;
			else
				odd += x;
			n = n / 10;
		}while(n != 0);

		int ans = 0;
		if(even > odd)
			ans = even - odd;
		else
			ans = odd-even;

		return ans;
	}

}
