package storingObjects;

public class MobileMainClass {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple", "15pro", 90000);
		Mobile m2 = new Mobile("Samsung", "s24" , 70000);

		Mobile[] m = {m1, m2};

		for(int i=0; i<m.length; i++) {
			System.out.println("Brand: "+m[i].brand+" "+"ModelNo: "+m[i].modelNo+" "+"Cost: "+m[i].cost);

		}

	}

}
