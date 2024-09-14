package traversingobjects;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
	
		// Only Forward Traversing
		Iterator<Integer> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

		System.out.println("-----------");

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);

		// Traversing Forward 
		ListIterator<Integer> x= l.listIterator();
		while (x.hasNext()) {
			System.out.println(x.next());

		}
		// Traversing Backward
		System.out.println("-----------");
		while (x.hasPrevious()) {
			System.out.println(x.previous());

		}
	}

}
