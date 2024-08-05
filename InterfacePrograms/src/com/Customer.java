package com;

class Customer implements Swiggy {
	@Override
	public void orderFood() {
		System.out.println("Ordering Food");
	}
	@Override
	public void pay() {
		System.out.println("Paying amount");
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.orderFood();
		c.pay();
	}

}
