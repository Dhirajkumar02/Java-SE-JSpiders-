package customsorting;

import java.util.TreeSet;

public class CarMainClass {

	public static void main(String[] args) {
		Car c1 = new Car(200000);
		Car c2 = new Car(600000);
		Car c3 = new Car(400000);
		
		//CarCostComparator cost = new CarCostComparator();
		// TreeSet<Car> t = new TreeSet<Car>(cost);
		TreeSet<Car> t = new TreeSet<Car>(new CarCostComparator());
		t.add(c1);
		t.add(c2);
		t.add(c3);
		
		for(Car c : t) {
			System.out.println(c);
		}
	}

}
