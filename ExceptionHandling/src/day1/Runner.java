package day1;


public class Runner {
	public static void main(String[] args) {

		System.out.println("Start");

		int[] a = {10, 20, 30};

		try {
			System.out.println(a[100]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index position");
		}
		System.out.println("End");
	}

}
