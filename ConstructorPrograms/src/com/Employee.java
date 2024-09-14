package com;

public class Employee {
	// Parameterized Custom Constructor
	Employee(int id){
		System.out.println("Id: "+id);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Employee e = new Employee(100);
		System.out.println("End");

	}
}
