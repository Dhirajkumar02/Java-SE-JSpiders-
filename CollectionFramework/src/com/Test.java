package com;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		// Internally an array gets created based on default initial capacity (10)
		ArrayList a = new ArrayList();
		
		// Internally an array gets created based on custom initial capacity (10)
		ArrayList b = new ArrayList(20);
		
		// Adding 1 Collection into another Collection
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		
		ArrayList y = new ArrayList(x);
		y.add(30);
		
		System.out.println(x); // [10, 20]
		System.out.println(y); // [10, 20, 30]
	}

}
