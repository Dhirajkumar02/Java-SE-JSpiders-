package com;

class Customer extends Swiggy {
	@Override
	void order() {
		System.out.println("Ordering Food!");
	}

	@Override
	void pay() {
		System.out.println("Paying Amount");
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.order();
		c.pay();
	}

}
