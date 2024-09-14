package org;

import java.util.Vector;

public class Solution {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);

		for(int  i : v) {
			System.out.println(i);
		}
	}

}
