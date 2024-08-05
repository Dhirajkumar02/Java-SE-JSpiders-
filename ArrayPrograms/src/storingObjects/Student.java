package storingObjects;

class Student {
	int age;
	String name;

	Student(int age, String name){
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Student s1 = new Student(22, "Dhiraj");
		Student s2 = new Student(23, "Saurabh");

		//Student[] s = {s1, s2}; 

		Student[] s = new Student[2];
		s[0]=s1;
		s[1]=s2;

		for(int i=0; i<s.length; i++) {
			System.out.println("Age: "+s[i].age +" "+"Name: "+s[i].name);
		}

	}

}

// i-> index & s[i] -> objects address
// s[i].age-> student age & s[i].name -> student name
