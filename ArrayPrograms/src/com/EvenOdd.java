package com;

public class EvenOdd {
	public static void main(String[] args) {
		int[] a= {12,17, 22, 27, 30};

		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
