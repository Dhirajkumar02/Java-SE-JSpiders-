package defaultsorting;

import java.util.TreeSet;

public class BeerMainClass {
	public static void main(String[] args) {
		Beer b1 = new Beer("A", 250.5);
		Beer b2 = new Beer("B", 150.3);
		Beer b3 = new Beer("C", 225.1);
		
		TreeSet<Beer> t = new TreeSet<Beer>();
		t.add(b1);
		t.add(b2);
		t.add(b3);
		for(Beer b : t) {
			System.out.println(b);
		}
	}

}
