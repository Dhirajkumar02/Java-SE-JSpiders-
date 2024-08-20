package interviewquestions;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {10, 15, 20, 23, 30};
		int sum=0;
		
		for(int i=0; i<=arr.length; i++) {
			if(i%2==0)
				sum += arr[i];
		}
		System.out.println("Sum: "+sum);
		
	}

}
