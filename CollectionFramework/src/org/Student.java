package org;

public class Student {
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return name+" has scored "+marks+" marks";
	}
}
