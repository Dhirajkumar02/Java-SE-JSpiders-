package storingobjects;

import java.util.ArrayList;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21, "Tom");
		Student s2 = new Student(22, "Jack");
		
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(s1); // l.add(new Student(21, "Tom"));
		l.add(s2); // l.add(new Student(22, "Jack"));
		for(Student s : l) {
			System.out.println(s); // printing s1 and s2 -> calls toString()
		}
		
	}

}
