package com;
//Accessing non static members in different class
class MobileMainClass {
	
	public static void main(String[] args) {
		
		Mobile mob = new Mobile();
		System.out.println("Brand: "+mob.brand);
		System.out.println("Cost: "+mob.cost);
		System.out.println("Color: "+mob.color);
		mob.call();
	}

}
