package javabean;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s = new Student();

		s.setAge(22);

		int age = s.getAge();
		System.out.println("Age: "+age);

		System.out.println("Age: "+s.getAge());
	}

}
