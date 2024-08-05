package com;

public class CarMainClass {
	public static void main(String[] args) {

		System.out.println("Brand: "+Car.brand);
		System.out.println("Cost: ₹"+Car.cost);

		System.out.println("------");

		Car.start();
		Car.stop();
	}

}
