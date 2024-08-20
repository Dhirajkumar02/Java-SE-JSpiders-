package interviewquestions;

public class Tom extends Student1 implements Hotel, Theatre {
	@Override
	public void watchMovie() {
		System.out.println("Watching Movie");
	}
	@Override
	public void eat() {
		System.out.println("Eating Food");
	}
	@Override
	public void study() {
		System.out.println("Studying Java");
	}

	public static void main(String[] args) {
		Tom t = new Tom();
		t.eat();
		t.study();
		t.watchMovie();
	}

}
