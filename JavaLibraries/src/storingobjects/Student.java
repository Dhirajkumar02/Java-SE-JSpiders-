package storingobjects;

public class Student {
	String name;
	
	public Student(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Name: "+name;
	}

}
