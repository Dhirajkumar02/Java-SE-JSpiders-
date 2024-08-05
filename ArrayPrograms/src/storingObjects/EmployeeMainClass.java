package storingObjects;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee("Saurabh", 2.6);
		Employee e2 = new Employee("Sazid", 2.5);
		Employee e3 = new Employee("Lalit", 3.4);
		Employee e4 = new Employee("Siddarth", 5.5);

		Employee[] emp = {e1, e2, e3, e4};
		for(int i=0; i<emp.length; i++) {
			if(emp[i].salary>=2.6 && emp[i].salary<=3.5) {
				System.out.println("Employee Name: "+emp[i].name+" and salary "+emp[i].salary+"LPA");

			}
		}
	}

}
