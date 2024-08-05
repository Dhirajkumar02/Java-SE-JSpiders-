package com;

//Accessing static members inside same class
public class Student {

	// Static variable
	static String name="Tom";

	// static method
	static void study() {
		System.out.println("Studing");
	}

	public static void main(String[] args) {
		System.out.println("Name: "+Student.name);
		Student.study();

		System.out.println("-----"); 
		System.out.println("Name: "+name); // ClassName.name -> Student.name
		study(); // ClassName.study() -> Student.study();
	}

}
