package com;

public class ForEachLoopDemo {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("--------");
		double[] marks = {72.4, 82.8, 87.0};
		for(double d : marks) {
			System.out.println(d);
		}
		
		System.out.println("--------");
		String[] fruits = {"Apple", "Banana","Orange"};
		for(String s : fruits) {
			System.out.println(s);
		}
	}

}
