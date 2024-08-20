package ctp;

public class MainClass {
	// Employee obj = new Developer(); or Employee obj = new Tester();
	static void display(Employee obj) {
		obj.work();
	}

	public static void main(String[] args) {

		// 1. Upcasting using a method
		display(new Developer());
		display(new Tester());

		System.out.println("-------------");

		// 2. Upcasting using single reference variable
		Employee emp;
		emp = new Developer(); // rule-3
		emp.work();
		emp = new Tester(); // rule-3
		emp.work();

		System.out.println("-----------");

		Employee e1 = new Developer(); //rule-3
		e1.work();
		Employee e2 = new Tester(); //rule-3
		e2.work();
	}

}
