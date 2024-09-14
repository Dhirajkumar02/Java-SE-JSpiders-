package string;

import java.util.Scanner;

public class PangramChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		boolean rs = isPangram(str);
		if(rs)
			System.out.println("String is Pangram");
		else 
			System.out.println("String is not a Pangram");
		sc.close();
	}

	public static boolean isPangram(String str) {
		// if length of the string is less than 26, it returns false
		if(str.length() < 26)
			return false;
		
		// To convert the string in lowercase
		str = str.toLowerCase();
		
		// loop through alphabet iterates over each character from 'a' to 'z'
		for (char ch = 'a';  ch <='z'; ch++) {
			
			// check if any character is not found then (indexOf returns -1), it returns false
			if(str.indexOf(ch) == -1)
				return false;
		}
		//If the loop completes without returning false, it means all letters from 'a' to 'z' are present in the string, so it returns true.
		return true;
	}

}

/*
 * 
 */
