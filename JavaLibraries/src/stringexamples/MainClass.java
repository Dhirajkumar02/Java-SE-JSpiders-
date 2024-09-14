package stringexamples;

public class MainClass {
	public static void main(String[] args) {
		String s1 = new String("Java");
		System.out.println(s1); // Java
		s1.concat(" Program");
		System.out.println(s1); //Java
		System.out.println("---------");

		String s2 = new String("Java");
		System.out.println(s2); // Java
		s2 = s2.concat(" Program");
		System.out.println(s2); //Java Program 
		System.out.println("---------");

		StringBuffer s3 = new StringBuffer("Wake");
		System.out.println(s3); // Wake
		s3.append(" Up!!");
		System.out.println(s3); // Wake Up!!
		System.out.println("--------");

		StringBuilder s4 = new StringBuilder("Today is");
		System.out.println(s4); // Today is
		s4.append(" Thursday");
		System.out.println(s4); // Today is Thursday
		System.out.println("--------");

		String s5 = new String("Dabba");
		System.out.println(s5); // Dabba
		s5 = s5.concat(" Fellows"); // s5.concat(" Fellows");
		System.out.println(s5); //Dabba Fellows

	}

}
