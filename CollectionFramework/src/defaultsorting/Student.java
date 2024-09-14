package defaultsorting;

public class Student implements Comparable<Student> {
	int age;

	Student(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Age: "+age;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.age - s.age;
		//return s.age - this.age;
		
	}
	

}
/** 
 * this -> current object to be inserted
 * s -> already existing object
 * return this.age - s.age; -> Ascending order
 * return s.age - this.age; -> Descending order
 */