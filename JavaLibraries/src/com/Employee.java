package com;

public class Employee {
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Emp Id of "+name+" is "+id;
	}

}
