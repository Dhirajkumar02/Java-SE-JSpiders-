package org;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		 ArrayList<String> l = new ArrayList<String>();
		 l.add("Tom");
		 l.add("Jack");
		 l.add("Jerry");
		 l.add("Dhiraj");
		 l.add("Lalit");
		 
		 for(String s : l) {
			 if(s.length() > 4 )
				 System.out.println(s);
		 }
	}

}
