package customsorting;

import java.util.TreeSet;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(23, "Mahendra");
		Student s2 = new Student(20, "Sazid");
		Student s3 = new Student(22, "Dhiraj");

		StudentAgeComparator age = new StudentAgeComparator();
		TreeSet<Student> t = new TreeSet<Student>(age);
		t.add(s1);
		t.add(s2);
		t.add(s3);

		for(Student s : t) {
			System.out.println(s);
		}
		
		System.out.println("-----------------------");

		StudentAgeComparator name = new StudentAgeComparator();

		TreeSet<Student> ts = new TreeSet<Student>(name);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);

		for(Student s : ts) {
			System.out.println(s);
		}


	}

}
