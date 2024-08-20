package org;

public class Person {
	int age;

	Person(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Age:"+age;
	}

	public static void main(String[] args) {
		Person p1 = new Person(21);
		Person p2 = new Person(22);
		System.out.println(p1); // p1.toString()
		System.out.println(p2); // p2.toString()

	}

}
