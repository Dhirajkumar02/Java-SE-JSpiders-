package customsorting;

import java.util.Comparator;

public class CarCostComparator implements Comparator<Car> {
	@Override 
	public int compare(Car x, Car y) {
		return x.cost - y.cost;
		// return y.cost - x.cost;
	}

}
