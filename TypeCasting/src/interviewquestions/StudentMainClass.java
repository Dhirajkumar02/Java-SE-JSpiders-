package interviewquestions;

public class StudentMainClass {

	static void findHighestMarks(Student s1, Student s2) {
		if(s1.marks > s2.marks) {
			System.out.println(s1.name+" has scored the highest marks");

		}
		else {
			System.out.println(s2.name+" has scored the highest marks");
		}

	}
	public static void main(String[] args) {
		Student s1 = new Student("Dhiraj", 70);
		Student s2 = new Student("Saurabh", 80);

		// findHighestMarks(new Student("Dhiraj", 70),new Student("Saurabh", 80));
		findHighestMarks(s1, s2);
	}

}
