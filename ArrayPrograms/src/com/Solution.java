package com;

public class Solution {
	public static void main(String[] args) {
		int[] a= {10, 20, 30};
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("-----");

		String[] fruits= {"Apple", "Mango", "Orange", "Banana"};
		for(int i=fruits.length-1; i>=0; i--) {
			System.out.println(fruits[i]);
		}
	}

}
