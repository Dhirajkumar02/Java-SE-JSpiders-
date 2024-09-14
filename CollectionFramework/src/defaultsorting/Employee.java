package defaultsorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	Double sal; // Wrapper class declaration to call compareTo() in Double class
	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+" Name: "+name+" Salary: "+sal;
	}
	@Override
	public int compareTo(Employee e) {
		return this.sal.compareTo(e.sal);
	}

}
/** 
 * this -> current objects to be inserted
 * e-> already existing object
 * 
 * Sorting on id(int):
 * for int sorting, use compareTo() of Double class
 * Ascending -> return  this.id - e.id;
 * Descending -> return  e.id - this.id;
 * 
 * Sorting on name(String):
 * for String sorting, use compareTo() of String class
 * Ascending -> return  this.name.compareTo(e.name);
 * Descending -> return  e.name.compareTo(this.name);
 * 
 * Sorting on sal(Double):
 * for Double sorting, use compareTo() of Double class
 * Ascending -> return  this.sal.compareTo(e.sal);
 * Descending -> return  e.sal.compareTo(this.sal);
*/