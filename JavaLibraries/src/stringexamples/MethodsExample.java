package stringexamples;

public class MethodsExample {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s.substring(2));
		System.out.println(s.substring(8));
		System.out.println(s.substring(4, 8));
		System.out.println(s.subSequence(1, 7));
		
		System.out.println("-------------");
		
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		// Reverse the String
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
	}

}
