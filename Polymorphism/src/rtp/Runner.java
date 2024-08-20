package rtp;

public class Runner {
	// 1. display(new Car()); -> Vehicle obj = new Car(); -> obj.start();
	// 2. display(new Bike()); -> Vehicle obj = new Bike(); -> obj.start();
	static void display(Vehicle obj) {
		obj.start();

	}
	public static void main(String[] args) {
		// 1. Upcasting using a method
		display(new Car());
		display(new Bike());
		
		System.out.println("------------");

		// 2. Upcasting using single reference variable
		Vehicle obj;
		obj = new Car();
		obj.start();
		obj = new Bike();
		obj.start();

		System.out.println("------------");
		
		// 3. Upcasting using separate reference variable
		Vehicle v1 = new Car();
		v1.start();
		Vehicle v2 = new Bike();
		v2.start();
	}

}
