package javabean;

import java.util.Scanner;

public class PersonMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person p = new Person();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		p.setAge(age); //p.setAge(sc.nextInt());
		sc.close();

		System.out.println("Age: "+p.getAge());

		
	}

}
