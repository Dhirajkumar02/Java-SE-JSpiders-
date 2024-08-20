package rtp;

public class FoodDeliveryApp {
	void orderFood() {
		System.out.println("Ordering Food!");
	}

}
class Swiggy extends FoodDeliveryApp{ //rule-1
	@Override // rule-2
	void orderFood() {
		System.out.println("Ordering Pizza from swiggy");
	}
}
class Zomato extends FoodDeliveryApp{ // rule-1
	@Override // rule-2
	void orderFood() { 
		System.out.println("Ordering Burger from Zomato");
	}
}
