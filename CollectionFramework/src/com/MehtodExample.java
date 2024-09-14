package com;

import java.util.ArrayList;

public class MehtodExample {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);

		ArrayList y = new ArrayList();
		y.addAll(x);
		y.add(30);

		System.out.println(y); // [10, 20, 30]
		System.out.println("---------");

		System.out.println(y.containsAll(x)); // true
		System.out.println("-----------");

		System.out.println(y); // [10, 20, 30]
		y.removeAll(x);
		System.out.println(y); // [30]
		System.out.println("***************");
		ArrayList i = new ArrayList();
		i.add(10);
		i.add(20);

		ArrayList j = new ArrayList();
		j.addAll(i);
		j.add(30);

		System.out.println("Element: "+j+ " Size: "+j.size());

	}
}

/**
 * i and j are ArrayList
 * 1. if we use i.addAll(j); -> we are adding all the element of 1 collection into another 
 *  collection 1 by 1 sequentially.
 *  Therefore elements are [10, 20, 30] and size is 3.
 *  
 **/
