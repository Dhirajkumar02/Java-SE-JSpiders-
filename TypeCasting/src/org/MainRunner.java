package org;

public class MainRunner {

	// Person obj = new Student();
	// Person obj = new Employee();
	static void display(Person obj) {
		if(obj instanceof Student) {
			Student s = new Student();
			System.out.println("Name: "+s.name);
			s.study();
		}
		else if(obj instanceof Employee) {
			Employee e = new Employee();
			System.out.println("Name: "+e.name);
			e.work();
		}
	}
	public static void main(String[] args) {
		display(new Student());
		System.out.println("-------");
		display(new Employee());
	}

}
