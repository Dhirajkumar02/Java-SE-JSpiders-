package customexception;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password:");
		int password = sc.nextInt();
		sc.close();
		
		if(password == 123) {
			System.out.println("Valid Password, Login Successful");
		}
		else {
			try {
				throw new InvalidPasswordException("Invalid Password Entered");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}

}
