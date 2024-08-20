package storingobjects;

public class HotelMainClass {
	public static void main(String[] args) {
		
		Hotel h1 = new Hotel("Taj1", 4.5);
		Hotel h2 = new Hotel("Taj2", 3.5);
		Hotel h3 = new Hotel("Taj3", 2.5);
		
		Hotel[] h = {h1, h2, h3};
		for(int i=0; i<h.length; i++) {
			System.out.println(h[i]);
		}
	}

}
