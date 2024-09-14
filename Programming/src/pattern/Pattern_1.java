package pattern;

import java.util.Scanner;

public class Pattern_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
		pattern9(n);
		pattern10(n);
		pattern11(n);
		pattern12(n);
		pattern13(n);
		pattern14(n);
		pattern15(n);
		pattern16(n);
		pattern17(n);
		pattern18(n);
	}

	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("A ");
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((i*i)+" ");
			}
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((j % 2)+" ");
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((i % 2)+" ");
			}
			System.out.println();
		}
	}
	static void pattern10(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print((j % 2)+" ");
			}
			System.out.println();
		}
	}

	static void pattern11(int n) {
		int k =1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(k+64)+" ");
				k++;
			}
			System.out.println();
		}
	}

	static void pattern12(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if(j % 2 == 0) {
					System.out.print("A ");
				}
				else {
					System.out.print("B ");
				}
			}
			System.out.println();
		}
	}

	static void pattern13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if((i+j)%2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	static void pattern14(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern15(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	static void pattern16(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern17(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
	}
	static void pattern18(int n) {
		int k =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char)(k+65)+" ");
				k++;
				if(k == 26)
					k =0;
			}
			System.out.println();
		}
	}

}
