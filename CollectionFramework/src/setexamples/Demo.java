package setexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		
		// Insertion order is not maintain
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(10);
		hs.add(1.2);
		hs.add("java");
		hs.add(null);
		hs.add(10);
		
		System.out.println("Size: "+hs.size());
		
		for(Object obj : hs) {
			System.out.println(obj);
		}
		
		System.out.println("---------");
		
		// Insertion order is maintain
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("apple");
		lhs.add("samsung");
		lhs.add("oneplus");
		lhs.add("Apple");
		
		System.out.println("Size: "+lhs.size());
		Iterator<String> i = lhs.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
	}

}
