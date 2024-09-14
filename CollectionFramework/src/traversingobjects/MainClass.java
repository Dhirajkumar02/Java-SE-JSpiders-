package traversingobjects;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("Tom");
		s.add("Lalit");
		s.add("Dhiraj");

		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
