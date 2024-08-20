package org;

public class Mobile {
	String brand;
	String modelNo;
	int cost;
	public Mobile(String brand, String modelNo, int cost) {
		this.brand=brand;
		this.modelNo=modelNo;
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Brand:"+brand+" ModelNo:"+modelNo+" Cost: ₹"+cost;
	}

}
