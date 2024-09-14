package com;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(1.5);
		l.add("java");
		l.add(null);
		l.add(10);

		System.out.println(l); // [10, 1.5, java, null, 10]
		System.out.println(l.get(1)); // 1.5
		System.out.println(l.size()); // 5
		System.out.println(l.contains("Java")); // false
		System.out.println(l.contains("java")); // true

		System.out.println("------------");

		System.out.println(l); //[10, 1.5, java, null, 10]
		l.remove(1);
		System.out.println(l); // [10, java, null, 10]
		System.out.println("---------");
		
		System.out.println(l.isEmpty()); // false
		l.clear();
		System.out.println(l); //[]
		System.out.println(l.isEmpty()); // true
	}

}
