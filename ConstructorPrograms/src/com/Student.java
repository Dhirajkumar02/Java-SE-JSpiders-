package com;

class Student {
	// Non-Parameterized Custom Constructor
	Student(){
		System.out.println("In Student");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Student s = new Student();
		System.out.println("End");
	}

}
