package storingobjects;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student("John");
		Student s2 = new Student("Jack");
		
		Student[] s = {s1, s2};
		for(int i=0; i<s.length; i++ ) {
			// printing s1 & s2 -> calls toString()
			System.out.println(s[i]);
		}
	}

}
