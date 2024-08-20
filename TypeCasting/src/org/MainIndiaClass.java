package org;

public class MainIndiaClass {
	static void display(India i) {
		if(i instanceof Karnataka) {
			Karnataka k = (Karnataka) i;
			System.out.println("State of Karnataka");
			System.out.println("Pm: "+k.pm+ " and Cm: "+k.cm);
		}
		else if(i instanceof TamilNadu) {
			TamilNadu t = (TamilNadu) i;
			System.out.println("State of TamilNadu");
			System.out.println("Pm: "+t.pm+ " and Cm: "+t.cm);
		}
		else if(i instanceof Goa) {
			Goa g = (Goa) i;
			System.out.println("State of Goa");
			System.out.println("Pm: "+g.pm+ " and Cm: "+g.cm);
		}
	}

	public static void main(String[] args) {
		display(new Karnataka());
		display(new TamilNadu());
		display(new Goa());
	}

}
