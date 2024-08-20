package rtp;

public class Employee {
	void work() {
		System.out.println("Empolyee is working");
	}

}
class Developer extends Employee{ // rule-1
	@Override // rule-2
	void work() {
		System.out.println("Developing App!");
	}
}
class Tester extends Employee{ // rule-1
	@Override // rule-2
	void work() {
		System.out.println("Testing App!");
	}
}
