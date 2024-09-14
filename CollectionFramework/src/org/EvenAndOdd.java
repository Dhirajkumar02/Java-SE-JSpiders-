package org;

import java.util.ArrayList;

public class EvenAndOdd {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(31);
		al.add(10);
		al.add(33);
		al.add(50);
		al.add(22);
		int ec = 0;
		int oc = 0;
		int sum = 0;
		for(int i : al) {

			if(i % 2 == 0) {
				ec++;
				sum = sum + i;
			}
			else {
				oc++;
			}
		}
		System.out.println("Even Numbers Count : "+ec);
		System.out.println("Odd Numbers Count : "+oc);
		System.out.println("Sum of Even Numbers :"+sum);
	}

}
