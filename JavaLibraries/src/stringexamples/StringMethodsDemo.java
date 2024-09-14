package stringexamples;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s = "Software Engineer";
		System.out.println(s.length()); // 17
		System.out.println(s.toUpperCase()); // SOFTWARE ENGINEER
		System.out.println(s.toLowerCase()); // software engineer
		System.out.println(s.startsWith("soft")); // false
		System.out.println(s.endsWith("eer")); // true
		System.out.println(s.charAt(2)); // f
		System.out.println(s.indexOf('e')); // 7
		System.out.println(s.contains("ware")); // true
		
		String x = "Java";
		String y = "Java";
		String z = "javA";
		System.out.println(x.equals(y)); // true
		System.out.println(x.equals(z)); // false
		System.out.println(x.equalsIgnoreCase(z)); // true
		System.out.println(x.replaceFirst("J", "Z"));
	}
}
