package ctp;

public class AmazonMainClass {
	public static void main(String[] args) {

		Amazon a = new Amazon();
		a.buy(20000);
		a.buy("Mobile");
		a.buy(20000, "Mobile");
		a.buy("Laptop", 40000);
	}

}
