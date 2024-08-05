package org;

public class Person {
	String name = "John";

}
class Student extends Person {
	void study() {
		System.out.println("Studying Java");
	}

}
class Employee extends Person {
	void work() {
		System.out.println("Working at Amazon");
	}
}
