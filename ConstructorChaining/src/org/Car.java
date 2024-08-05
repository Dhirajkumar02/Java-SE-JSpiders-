package org;

public class Car {
	String brand;
	int cost;

	Car(String brand){
		this.brand=brand;
	}
	Car(String brand, int cost){
		this(brand);
		this.cost=cost;
	}
	public static void main(String[] args) {
		Car c = new Car("Suzuki", 20000);
		System.out.println("Brand Name of car is "+c.brand);
		System.out.println("Cost of car is "+c.cost);
	}

}
