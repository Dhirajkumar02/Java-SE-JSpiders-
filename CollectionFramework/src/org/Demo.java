package org;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		
		for(int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("----------");
		
		for(int i : l) {
			System.out.println(i);
		}
	}

}
