package org;

public class Solution {

	// Generalization or Up casting
	// 1. If selectVehicle(new Car()); -> Vehicle v = new Car();
	// 2. If selectVehicle(new Car()); -> Vehicle v = new Bike();
	static void selectVehicle(Vehicle v) {
		if(v instanceof Car) {
			Car c = (Car) v; // down casting
			System.out.println("Brand: "+c.brand);
			c.drive();
		}
		else if(v instanceof Bike) {
			Bike b = (Bike) v; // down casting
			System.out.println("Brand: "+b.brand);
			b.ride();
		}
	}
	public static void main(String[] args) {
		selectVehicle(new Car());
		System.out.println("--------");
		selectVehicle(new Bike());

	}

}
