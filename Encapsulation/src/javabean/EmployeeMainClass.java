package javabean;
import java.util.*;
public class EmployeeMainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.print("Enter id: ");
		int id =sc.nextInt();
		emp.setId(id); //emp.setId(sc.nextInt());

		System.out.print("Enter name: ");
		String name = sc.next();
		emp.setName(name);

		System.out.print("Enter salary: ");
		double sal = sc.nextDouble();
		emp.setId(sal);
		sc.close();

		System.out.println("Employee Details:");
		System.out.println("-----------------");
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSal());


	}

}
