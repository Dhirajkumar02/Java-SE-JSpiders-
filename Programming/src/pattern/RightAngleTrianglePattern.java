package pattern;

import java.util.Scanner;

public class RightAngleTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
//		pattern1(n);
//		pattern2(n);
//		pattern3(n);
//		pattern4(n);
//		pattern5(n);
//		pattern6(n);
//		pattern7(n);
//		pattern8(n);
//		pattern9(n);
//		pattern10(n);
//		pattern11(n);
		pattern12(n);
		pattern13(n);
		pattern15(n);
		pattern14(n);
		pattern16(n);

	}

	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print("A ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j =1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j =i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =n; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =i; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern10(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j =1; j<=(n-i+1); j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =n; j>=(n-i+1); j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern12(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern14(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern15(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <=i; j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern16(int n) {
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			char c = ch;
			for (int j =1; j <=i; j++) {
				System.out.print(c+" ");
				c += (n-j);
			}
			System.out.println();
			ch++;
		}
	}






}
