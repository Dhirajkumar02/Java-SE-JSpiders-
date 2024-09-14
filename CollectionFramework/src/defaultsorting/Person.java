package defaultsorting;

public class Person implements Comparable<Person> {
	String name;

	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: "+name;
	}
	@Override
	public int compareTo(Person p) {
		return  this.name.compareTo(p.name);
		//return  p.name.compareTo(this.name);
		
	}

}

// this -> current objects to be inserted
// p-> already existing object
// for String sorting, use compareTo() of String class
// Ascending -> return  this.name.compareTo(p.name);
// Descending -> return  p.name.compareTo(this.name);