package com;

public class Pen extends Object { // Implicitly inherited by Object class

	@Override
	public String toString() {
		return "Pen@123";
	}
	public static void main(String[] args) {

		Pen p =new Pen();
		System.out.println(p); // Implicitly calling method toString() -> p.toString() 
		System.out.println(p.toString()); // Explicitly calling method toString()
	}

}

// FullQalifiedClassName@HexadecimalvalueOfTheHashcode
//String representation of an Object