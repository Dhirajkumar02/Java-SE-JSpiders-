package defaultsorting;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(104, "Dhiraj", 250000);
		Employee e2 = new Employee(102, "Mahendra", 650000);
		Employee e3 = new Employee(103, "Lalit", 550000);
		Employee e4 = new Employee(101, "Sazid", 450000);
		
		TreeSet<Employee> t = new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		for(Employee e : t) {
			System.out.println(e);
		}
	}

}
