package com;

import java.util.ArrayList;

public class GenericEsxample {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("JavaSript");
		l.add("Python");
		l.add("java");

		for(String s : l) {
			System.out.println(s);
		}

		System.out.println("----------");
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		for(int i : a) { // (Integer i : a)
			System.out.println(i);
		}

		System.out.println("------------");
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10); // al.add(new Integer(10));
		al.add(1.2); // al.add(new Double(1.2));
		al.add("Java"); // al.add(new String("Java"));
		for(Object obj : al) {
			System.out.println(obj);
		}

	}

}
