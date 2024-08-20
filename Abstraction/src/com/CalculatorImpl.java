package com;

public class CalculatorImpl implements Calculator{ // Rule-2

	@Override // Rule-3 
	public void add(int x, int y) {
		int sum = x+y;
		System.out.println("Sum of "+x+" & "+y+" is "+sum);
	}
	@Override // Rule-3 
	public void mul(int x, int y) {
		int prod = x*y;
		System.out.println("Product of "+x+" & "+y+" is "+prod);
	}

}
