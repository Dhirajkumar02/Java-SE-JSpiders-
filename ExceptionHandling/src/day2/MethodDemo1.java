package day2;

public class MethodDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
			
			System.out.println(e.getMessage());
		}
	}

}
