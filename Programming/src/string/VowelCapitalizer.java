package string;

import java.util.Scanner;

public class VowelCapitalizer {
    
    public static String convertVowelsToUppercase(String str) {
        // Convert the str string to a character array
        char[] ch = str.toCharArray();
        
        // Loop through each character in the array
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // Convert the vowel to uppercase
                ch[i] = Character.toUpperCase(c);
            } else {
                // Convert non-vowel characters to lowercase
                ch[i] = Character.toLowerCase(c);
            }
        }
        
        // Convert the character array back to a string and return it
        return new String(ch);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        String result = convertVowelsToUppercase(str);
        System.out.println("Converted String: " + result);
        sc.close();
    }
}

