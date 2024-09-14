package org;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q); // [10, 20, 30]
		System.out.println(q.poll()); // 10
		System.out.println(q); // [20, 30]
		q.clear();
		System.out.println(q.isEmpty()); // true
		System.out.println(q.poll()); // null
		//System.out.println(q.remove()); // NoSuchElementException
		
	}

}
