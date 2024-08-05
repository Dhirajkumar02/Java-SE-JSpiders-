package com;
// Accessing non static members inside same class
class Student {
	// non static variable
	int age = 22;

	// non static method
	void study() {
		System.out.println("Studing Java!!");
	}
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Age: "+s.age);
		s.study();
	}
}
