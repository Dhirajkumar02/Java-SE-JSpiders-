package com;

// Access public members inside same class
public class Student {

	public static int age =22;

	public void study() {
		System.out.println("Studying Java");
	}

	public static void main(String[] args) {
		System.out.println("Age: "+Student.age);

		Student s = new Student();
		s.study();
	}

}
