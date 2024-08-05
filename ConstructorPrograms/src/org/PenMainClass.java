package org;

public class PenMainClass {
	public static void main(String[] args) {
		
		Pen p1 = new Pen("parker", 50);
		Pen p2 = new Pen("camlin", 50);
		System.out.println("Cost of "+p1.brand+" pen is ₹"+p1.cost);
		System.out.println("Cost of "+p2.brand+" pen is ₹"+p2.cost);

	}

}
