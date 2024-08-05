package com;

public class MainMethodExample {
	public static void main(int x) {
		System.out.println("x: "+x);

	}
	public static void main(String[] args) {
		System.out.println("Start");
		main(10);
		main(1.2);
		System.out.println("End");
	}
	public static void main(double x) {
		System.out.println("x: "+x);

	}

}
