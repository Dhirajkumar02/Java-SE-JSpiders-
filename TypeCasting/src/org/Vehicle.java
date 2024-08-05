package org;

public class Vehicle {
	String brand = "Suzuki";

}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is Driving");
	}
}
class Bike extends Vehicle {
	void ride() {
		System.out.println("Bike is Riding");
	}
}
