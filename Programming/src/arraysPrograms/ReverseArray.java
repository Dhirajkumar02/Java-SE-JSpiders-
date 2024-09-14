package arraysPrograms;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {23, 40, 34, 21, 98, 56};
		reverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void reverseArray(int[] arr) {
		int l=0;
		int r = arr.length-1;
		while(l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		
	}

}
