package ctp;

public class Amazon {
	void buy(String product) {
		System.out.println("Product: "+product);
	}
	void buy(int cost) {
		System.out.println("Cost: "+cost);
	}
	void buy(String product, int cost) {
		System.out.println("Product: "+product+" Cost: "+cost);
	}
	void buy(int cost, String product) {
		System.out.println("Cost: "+cost+" Product: "+product);
	}

}
