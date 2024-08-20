package comparingObjects;

public class Person {
	int age;
	double height;
	public Person(int age, double height) { 
		this.age = age;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) { // Object obj = new Person(22, 5.4);
		if (obj instanceof Person) {
			Person p = (Person)obj; // Downcasting
			return this.age == p.age && this.height == p.height; //comparison logic
		}
		return false;
	}

	public static void main(String[] args) {
		Person p1 = new Person(22, 5.4);
		Person p2 = new Person(22, 5.4);
		System.out.println(p1.equals(p2));
	}

}
