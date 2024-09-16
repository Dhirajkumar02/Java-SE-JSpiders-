package mapexamples;

import java.util.LinkedHashMap;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Apple");
		map.put(20, "Samsung");
		map.put(30, "Oneplus");

		Set<Integer> keys = map.keySet(); // 10 20 30
		for (int key : keys) { // 1 from many
			System.out.println(key+" -> "+map.get(key));
		}
		
		System.out.println("----------");
		for(int key : map.keySet()) { // 1 from many
			System.out.println(key+" -> "+map.get(key));
		}
	}

}
