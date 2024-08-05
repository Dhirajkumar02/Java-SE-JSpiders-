package com;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display(101);
		emp.display(102, "Tom");
		emp.display(3.5);
		emp.display("Jerry", 103);
	}

}
