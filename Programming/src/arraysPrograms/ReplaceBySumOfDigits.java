package arraysPrograms;

public class ReplaceBySumOfDigits {
	public static void main(String[] args) {
		int[] arr = {23, 34, 74, 15, 57};
		replaceBySumOfDigits(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void replaceBySumOfDigits(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = sumOfDigits(x[i]);
		}

	}

	public static int sumOfDigits(int n) {
		int sum =0;
		do {
			int d = n%10;
			sum = sum+d;
			n = n/10;	
		} while (n != 0);
		return sum;
	}

}
