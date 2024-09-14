package pattern;

import java.util.Scanner;

public class PrimidExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		//pattern1(n);
		//pattern2(n);
		//pattern3(n);
		//pattern4(n);
		//pattern5(n);
		//pattern6(n);
		//pattern7(n);
		//pattern8(n);
		//pattern9(n);
		//pattern10(n);
		//pattern11(n);
		//pattern12(n);
		//pattern13(n);
		pattern14(n);
	}

	// first approach
	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");

			}
			int t = 1;
			for (int k = 1; k <= 2*i-1; k++) {
				if(k % 2 == 0)
					System.out.print(" * ");
				else
					System.out.print(t++ +"");
			}
			System.out.println();

		}
	}
	//	Second Method
	static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");

			}
			for (int k = 1; k <=i; k++) {

				System.out.print(k+"");
				if(k != i)
					System.out.print(" * ");
			}
			System.out.println();

		}
	}

	static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");

			}
			int x = 1;
			for (int k = 1; k <=2*i-1; k++) {

				System.out.print(x+" ");
				if(k < i)
					x++;
				else
					x--;
			}
			System.out.println();

		}
	}

	// Opposite triangle pattern

	static void pattern4(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");

			}
			for (int k = 1; k <=2*i-1; k++) {

				System.out.print("*"+" ");
			}
			System.out.println();

		}
	}

	static void pattern5(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");

			}
			int x = 1;
			for (int k = 1; k <=2*i-1; k++) {

				System.out.print(x+" ");
				if(k < i)
					x++;
				else
					x--;
			}
			System.out.println();

		}
	}

	static void pattern6(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");

			}
			int x = n-i+1;
			for (int k = 1; k <=2*i-1; k++) {

				System.out.print(x+" ");
				if(k < i)
					x++;
				else
					x--;
			}
			System.out.println();

		}
	}

	// Pascal's Triangle pattern

	static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");

			}
			int x = 1;
			for (int k = 1; k <= i; k++) {

				System.out.print(x+" ");

				x = x*(i-k)/k;
			}
			System.out.println();

		}
	}

	// Diamond shape pattern

	static void pattern8(int n) {
		int sp = n/2, st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");

			}
			for (int k = 1; k <= st; k++) {
				System.out.print("* ");
			}
			if(i <= n/2) {
				sp--;
				st = st+2;
			}
			else {
				sp++;
				st = st-2;
			}
			System.out.println();

		}
	}

	// Opposite Diamond shape pattern

	static void pattern9(int n) {
		int sp = 0, st = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");

			}
			for (int k = 1; k <= st; k++) {
				System.out.print("* ");
			}
			if(i <= n/2) {
				sp++;
				st = st-2;
			}
			else {
				sp--;
				st = st+2;
			}
			System.out.println();

		}
	}

	// Hollow diamond pattern

	static void pattern10(int n) {
		int sp = n/2, st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");

			}
			for (int k = 1; k <= st; k++) {
				if(k == 1 || k == st)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(i <= n/2) {
				sp--;
				st = st+2;
			}
			else {
				sp++;
				st = st-2;
			}
			System.out.println();

		}
	}

	// Hollow Square pattern
	static void pattern11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i == 1 || i == n || j == 1 || j == n)
					System.out.print("*  ");
				else
					System.out.print("   ");

			}
			System.out.println();

		}
	}
	
	// Hollow Square pattern
		static void pattern12(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(i == 1 || i == n || j == 1 || j == n || i == n/2+1 || j == n/2+1)
						System.out.print("*  ");
					else
						System.out.print("   ");

				}
				System.out.println();

			}
		}
		
		// Line Cross pattern
		static void pattern13(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(i == n/2+1 || j == n/2+1 || i == j || (n == i+j-1))
						System.out.print("*  ");
					else
						System.out.print("   ");

				}
				System.out.println();

			}
		}

		// Plus Pattern
		static void pattern14(int n) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if(i == n/2+1 || j == n/2+1)
						System.out.print("*  ");
					else
						System.out.print("   ");

				}
				System.out.println();

			}
		}
}
