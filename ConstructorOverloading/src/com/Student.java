package com;

public class Student {
	Student(int age){
		System.out.println("Age: "+age);
	}

	Student(String name){
		System.out.println("Name: "+name);
	}

	Student(int age,String name){
		System.out.println("Age: "+age+" Name: "+name);
	}

	Student(String name, int age){
		System.out.println("Name: "+name+" Age: "+age);
	}

	public static void main(String[] args) {
		new Student("John");
		new Student("John", 22);
		new Student(21, "Tom");
		new Student(20);

	}

	//	public static void main(String[] args) {
	//		Student s1 = new Student("John");
	//		Student s2 = new Student("John", 22);
	//		Student s3 = new Student(21, "Tom");
	//		Student s4 = new Student(20);
	//
	//	}

}
