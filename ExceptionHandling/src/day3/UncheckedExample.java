package day3;

public class UncheckedExample {
	public static void main(String[] args) {
		int[] a = {10, 20};
		System.out.println(a[99]);
		
		System.out.println(10/0);
	}

}

// Unchecked Example -> ArrayOutOfBoundException, ArithmeticException