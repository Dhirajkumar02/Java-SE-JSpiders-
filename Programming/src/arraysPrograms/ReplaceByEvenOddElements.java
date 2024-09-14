package arraysPrograms;

import java.util.Scanner;

public class ReplaceByEvenOddElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element:");
		int n = sc.nextInt(); // 5
		int[] arr = new int[n]; //{10, 20, 23, 43, 16, 47, 85};
		System.out.println("Enter "+n+ " Integer value:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("User entered array element:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		updateEvenOdd(arr);
		sc.close();

	}

	public static void updateEvenOdd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] % 2;
			System.out.print(arr[i]+" ");
		}
		

	}
}
