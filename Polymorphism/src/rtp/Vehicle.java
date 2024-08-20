package rtp;

public class Vehicle {
	void start() {
		System.out.println("Vehicle Started");
	}

}
class Car extends Vehicle{ // rule-1
	@Override // rule-2
	void start() {
		System.out.println("Car Started");
	}
}
class Bike extends Vehicle{ // rule-1
	@Override // rule-2
	void start() {
		System.out.println("Bike Started");
	}
}
