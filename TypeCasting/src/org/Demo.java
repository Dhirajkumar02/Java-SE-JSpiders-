package org;

public class Demo {
	public static void main(String[] args) {

		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();

		System.out.println(s instanceof Son);
		System.out.println(s instanceof Father);
		System.out.println(new Son() instanceof Father);

		System.out.println(d instanceof Daughter);
		System.out.println(d instanceof Father);

		System.out.println(f instanceof Father);
		System.out.println(f instanceof Son);
		System.out.println(f instanceof Daughter);
		System.out.println(new Father() instanceof Daughter);
	}

}
