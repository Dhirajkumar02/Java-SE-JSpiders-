package com;

// Accessing static members in different class
public class MainClass {
	public static void main(String[] args) {

		System.out.println(Employee.id);
		System.out.println(Employee.name);
		Employee.work();
	}

}
