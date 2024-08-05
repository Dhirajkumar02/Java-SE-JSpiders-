package com;

public class Employee {
	Employee(int age){
		this(3.6);
		System.out.println("Age:"+age);
	}
	Employee(int id, String name){
		System.out.println("Id:"+id+" Name:"+name);
	}
	Employee(double sal){ // height=5.6;
		this(101, "Tom");
		System.out.println("Salary:"+sal);
	}

	public static void main(String[] args) {
		new Employee(23);
	}

}
