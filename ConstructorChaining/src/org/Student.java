package org;

public class Student {
	int age;
	String name;

	Student(int age){
		this.age=age;
	}
	Student(int age, String name){
		this(age); // this(22); //=> avoiding code redundancy -> this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Student s = new Student(22, "Tom");
		System.out.println("Age: "+s.age+" Name: "+s.name);
	}

}
