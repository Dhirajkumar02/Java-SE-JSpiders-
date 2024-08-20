package primitivecasting;

public class Demo {
	public static void main(String[] args) {
		
		// Widening -> Smaller to Bigger -> Implicitly
		int x = 10;
		double y = x;
		System.out.println(x+" "+y);
		
		double d =50;
		System.out.println(d);
		
		char ch = 'a';
		int i = ch;
		System.out.println(ch+" "+i);
		
		System.out.println("--------");
		
		// Narrowing -> Bigger to Smaller -> Explicitly
		double a = 12.25;
		int b = (int)a;
		System.out.println(a+" "+b);
		
		int p =(int)67.45;
		System.out.println(p);
		
		int j = 65;
		char c = (char)j;
		System.out.println(j+" "+c);
		
		char h =' ';
		int g = (char)h;
		System.out.println(h+" "+g);
		
		System.out.println("-------");
		
		System.out.println((int)89.25); //89
		System.out.println((char)65);// A
		System.out.println("A"+"A"); // AA
		System.out.println("A"+10); // A10
		System.out.println('A'+"B"); // AB
		System.out.println("A"+10+20); // A1020
		System.out.println(10+20+"A"); // 30A
		System.out.println('A'+'B'); // 131
		System.out.println('a'+20); // 117
		
		
		
	}

}
