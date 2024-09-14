package string;

import java.util.Scanner;

public class CountStringCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int upperCount = 0, lowerCount = 0, digitsCount = 0, SpecialCharCount = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				upperCount++;
			else if(ch >= 'a' && ch <= 'z')
				lowerCount++;
			else if (ch >= '0' && ch <= '9') 
				digitsCount++;
			else
				SpecialCharCount++;
		}
		System.out.println("Number of capital letters: "+upperCount);
		System.out.println("Number of small letters: "+lowerCount);
		System.out.println("Number of special characters: "+SpecialCharCount);
		System.out.println("Number of digits: "+digitsCount);
		sc.close();

	}

}
