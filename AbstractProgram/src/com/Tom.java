package com;

public class Tom extends Student {
	@Override
	void study() {
		System.out.println("Studying Java");
	}
	public static void main(String[] args) {
		Tom t = new Tom();
		t.study();
	}


}
