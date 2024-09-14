   package com;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
 		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(10);
		
		System.out.println(al); // [20, 30, 10]
		Collections.sort(al); 
		System.out.println(al); // [10, 20,30]
		Collections.reverse(al);
		System.out.println(al); // [30, 20, 10]
		
		
		System.out.println("--------");
		
		ArrayList<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(1.2);
		l.add("java");
		System.out.println(l); // [10, 1.2, java]
		Collections.reverse(l);
		System.out.println(l); // [java, 1.2, 10]
		
	}

}
