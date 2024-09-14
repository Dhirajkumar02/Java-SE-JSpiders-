package storingobjects;

import java.util.LinkedList;

public class CricketPlayerMainClass {
	public static void main(String[] args) {
		
		CricketPlayer c1 = new CricketPlayer("Virat", "India", 1200);
		CricketPlayer c2 = new CricketPlayer("Rohit", "India", 1500);
		
		LinkedList<CricketPlayer> l = new LinkedList<CricketPlayer>();
		l.add(c1);
		l.add(c2);
		
		for(CricketPlayer cp : l) {
			System.out.println(cp); // printing objects, calls toString()
		}
	}

}
