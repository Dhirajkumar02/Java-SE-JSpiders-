package com;
// Accessing non static members in different class
class MainClass {
	public static void main(String[] args) {
		
		Employee emp = new Employee();

		System.out.println("Name: "+emp.name);
		System.out.println("Salary: "+emp.salary);
		emp.work();
	}
}
