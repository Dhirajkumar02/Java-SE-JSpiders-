package com;

public class Student {
	Student(int age){
		System.out.println("Age: "+age);
	}
	Student(String name){
		this(5.6);
		System.out.println("Nmae: "+name);
	}
	Student(double height){
		this(22);
		System.out.println("Height: "+height);
	}

	public static void main(String[] args) {
		Student s = new Student("Tom");
	}

}
