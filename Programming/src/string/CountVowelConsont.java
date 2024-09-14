package string;

import java.util.Scanner;

public class CountVowelConsont {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int vc = 0;
		int cc = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' )
					vc++;
				else
					cc++;
			}
		}
		System.out.println("Vowel: "+vc +" Consonant: "+cc);
		sc.close();
	}
}
