package day2;

public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
		
		System.out.println("End");
	}
}
