package com;
import java.util.Scanner;
public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id:");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name:");
		String name =sc.next();
		System.out.print("Enter Employee Gender:");
		char gender = sc.next().charAt(0);
		System.out.print("Enter Employee Salary:");
		double sal =sc.nextDouble();
		sc.close();
		System.out.println("--------");
		System.out.println("Id: "+id+" Name: "+name+" Gender: "+gender+" salary: "+sal);
	}

}
