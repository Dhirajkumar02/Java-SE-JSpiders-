package string;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		countVowels(str);
		sc.close();
	}

	public static void countVowels(String str) {
		int vc = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vc++;
			}
		}
		System.out.println("Number of vowels present in the String: "+vc);
	}

}
