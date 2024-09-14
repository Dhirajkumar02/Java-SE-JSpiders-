package day2;

public class Demo {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
		catch (ArithmeticException e) {
			System.out.println("Invalid Denominator");
		}
		catch (Exception e) {
			System.out.println("Super Class Handled");
		}
	}

}
