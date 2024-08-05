package javabean;

public class MobileMainClass {
	public static void main(String[] args) {
		Mobile m = new Mobile();

		m.setBrand("Infinix");
		m.setCost(17000);

		String brand=m.getBrand();
		int cost = m.getCost();

		System.out.println("Brand: "+brand);
		System.out.println("Cost: ₹"+cost);

		//System.out.println("Brand: "+m.getBrand());
		//System.out.println("Cost: "+m.getCost());
	}

}
