package com;

class SumAndAvg {
	public static void main(String[] args) {
		int[] a = {10, 20, 30};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+(sum/a.length));
	}
}
