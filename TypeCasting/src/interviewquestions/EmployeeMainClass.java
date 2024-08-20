package interviewquestions;

public class EmployeeMainClass {
	static void findHighestSalary(Employee e1, Employee e2, Employee e3) {
		if(e1.sal> e2.sal && e1.sal>e3.sal) {
			System.out.println(e1.name+" has the highest salary");
		}
		else if(e2.sal>e1.sal && e2.sal>e3.sal) {
			System.out.println(e2.name+" has the highest salary");
		}
		else {
			System.out.println(e3.name+" has the highest salary");
		}

	}
	public static void main(String[] args) {
		Employee e1 =new Employee("Tom", 4.5);
		Employee e2 =new Employee("Jerry", 6.5);
		Employee e3 =new Employee("Jack", 5.8);

		findHighestSalary(e1, e2, e3);
	}

}
