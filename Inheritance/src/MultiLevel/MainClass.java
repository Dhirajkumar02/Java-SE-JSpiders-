package MultiLevel;

public class MainClass {
	public static void main(String[] args) {

		Deparment d = new Deparment();

		System.out.println(d.universityName);
		System.out.println(d.collegeName);
		System.out.println(d.deparmentName);

		System.out.println("-------");

		d.giveAssignments();
		d.conductInternals();
		d.conductExams();

	}

}
