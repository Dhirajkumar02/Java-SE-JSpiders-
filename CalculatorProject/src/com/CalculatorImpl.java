package com;

public class CalculatorImpl implements Calculator {
	@Override // Rule-3 
	public void add(int x, int y) {
		System.out.println("Addition of "+x+" & "+y+" is "+(x + y));
	}
	
	@Override // Rule-3 
	public void sub(int x, int y) {
		System.out.println("Subtraction of "+x+" & "+y+" is "+(x - y));
	}
	
	@Override // Rule-3 
	public void mul(int x, int y) {
		System.out.println("Multiplication of "+x+" & "+y+" is "+(x * y));
	}
	
	@Override // Rule-3 
	public void div(int x, int y) {
		if(y != 0) {
			System.out.println("Division of "+x+" & "+y+" is "+(x / y));
		}
		else {
			System.out.println("Division by Zero is not allowed.");
		}
	}
}