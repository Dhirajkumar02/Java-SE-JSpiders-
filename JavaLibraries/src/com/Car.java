package com;

public class Car {
	@Override
	public String toString() {
		return "Car@100";
	}
	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println(c);
		System.out.println(c.toString());
	}

}
