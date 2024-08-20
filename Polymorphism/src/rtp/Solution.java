package rtp;

public class Solution {
	// 1.  showing(new Swiggy()); -> FoodDelivery obj = new Swiggy(); -> obj.orderFood();
	// 2.  showing(new Zomato()); -> FoodDelivery obj = new Zomato(); -> obj.orderFood();
	static void showing(FoodDeliveryApp obj) {
		obj.orderFood();
	}
	public static void main(String[] args) {
		// Upcasting using a method
		showing(new Swiggy());
		showing(new Zomato());

		System.out.println("-----------");
		// 3. Upcasting using separate reference variable
		FoodDeliveryApp f1 = new Swiggy();
		f1.orderFood();
		FoodDeliveryApp f2 = new Zomato();
		f2.orderFood();

		System.out.println("------------");
		// 2. Upcasting using single reference variable
		FoodDeliveryApp obj;
		obj = new Swiggy();
		obj.orderFood();
		obj = new Zomato();
		obj.orderFood();
	}

}
