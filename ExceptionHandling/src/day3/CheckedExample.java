package day3;

import java.io.*;

public class CheckedExample {
	public static void main(String[] args) {
		// Unchecked exception type InterruptedException
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
			Thread.sleep(2000); // surround using try & catch
			}
			catch (Exception e) {
				System.out.println("Handled");
			}
		}
		
		System.out.println("--------");
		// Unchecked exception type FileNotFoundException
		try {
		FileReader f = new FileReader("guldu.txt"); //surround using try & catch
		}
		catch (FileNotFoundException f) {
			System.out.println("File Not Found");
		}
	}

}
