package org;

import java.util.*;

public class StudentMainClass {
	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student("Tom", 50));
		l.add(new Student("Jack", 70));

		ListIterator<Student> i = l.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println("---------------");
		while (i.hasPrevious()) {
			System.out.println(i.previous());

		}
	}

}
