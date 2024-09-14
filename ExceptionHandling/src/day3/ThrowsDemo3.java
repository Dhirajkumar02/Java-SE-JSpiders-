package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo3 {
	static void read() throws FileNotFoundException {
		FileReader f = new FileReader("car.text");
	}
	public static void main(String[] args) {
		try {
			read();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			System.out.println(e.getMessage());
		}
		
	}

}
