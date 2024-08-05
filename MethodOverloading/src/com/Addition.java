package com;

public class Addition {

	void add(int x, int y) {
		int sum=x+y;
		System.out.println("Sum of "+x+ " & "+y+" is "+sum);
	}

	void add(int x, int y, int z) {
		int sum=x+y+z;
		System.out.println("Sum of "+x+ " & "+y+" & "+z+ " is "+sum);
	}

	void add(int x, double y) {
		double sum=x+y;
		System.out.println("Sum of "+x+ " & "+y+" is "+sum);
	}

	void add(double x, int y) {
		double sum=x+y;
		System.out.println("Sum of "+x+ " & "+y+" is "+sum);
	}

}
