package com;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(27);
		l.add(39);
		
		System.out.println(l);
		l.add(1, 55);
		System.out.println(l);
		l.set(2, 77);
		System.out.println(l);
	}

}
