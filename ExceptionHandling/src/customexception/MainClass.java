package customexception;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		sc.close();
		if(marks>60){
			System.out.println("Apply for amazon interview");
		}else{
			try {
				throw new InvalidMarksException("Not sufficient marks");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
