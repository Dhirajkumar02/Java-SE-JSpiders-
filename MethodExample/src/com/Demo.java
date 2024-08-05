package com;

public class Demo {
	static void m1() {
		System.out.println("Hi");
	}
	static void m2(int x) {
		System.out.println(x);
	}
	static String m3() {
		return "Learn Java";
	}
	static int m4(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		m1();
		m2(10);
		System.out.println(m3());
		System.out.println(m4(10, 20));
		
	}

}
