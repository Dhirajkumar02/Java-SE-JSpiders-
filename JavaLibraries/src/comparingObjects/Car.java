package comparingObjects;

public class Car {
	int cost;
	public Car(int cost) {
		this.cost=cost;
	}
	@Override
	public boolean equals(Object obj) { // Upcasting -> Object obj = new Car(2000);
		if(obj instanceof Car) {
			Car c = (Car) obj;   // Downcasting
			return this.cost == c.cost; // Comparing logic -> c1.cost == c2.cost;
		}
		return false;
	}
	public static void main(String[] args) {
		Car c1 = new Car(2000);
		Car c2 = new Car(2000);
		System.out.println(c1.equals(c2)); // c1.equals(new Car(2000));
	}

}

// c1 -> this & c2 -> obj -> c