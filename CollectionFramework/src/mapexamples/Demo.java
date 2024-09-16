package mapexamples;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		//HashMap map = new HashMap();
		Map map = new HashMap();
		map.put(10, "Hi");
		map.put("A", 1.2);
		map.put(3.45, 55);
		
		System.out.println(map); // {A=1.2, 3.45=55, 10=Hi}
		System.out.println(map.size()); // 3
		System.out.println(map.containsKey(10)); // true
		System.out.println(map.containsValue("Hi")); // true
		System.out.println(map.containsValue("hai")); // false
		System.out.println(map.get(10)); // Hi
		System.out.println(map.get(100)); // null
		
		System.out.println("-------------");
		System.out.println(map); // {A=1.2, 3.45=55, 10=Hi}
		map.remove(10);
		System.out.println(map); // {A=1.2, 3.45=55}
		
		System.out.println("----------------");
		System.out.println(map.isEmpty());// false
		map.clear();
		System.out.println(map.isEmpty()); // true
	}

}
