package stringexamples;

public class Solution {
	public static void main(String[] args) {
		String s = new String("A");
		System.out.println(s); // calls s.toString() implicitly
		System.out.println(s.toString());
		System.out.println("---------");

		System.out.println(s.hashCode());
		System.out.println("--------");

		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		System.out.println(s1 == s2); // Compares address or reference
		System.out.println(s1.equals(s2)); // compares data or content
	}

}
