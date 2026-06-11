package fileHandling;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("student.txt");
		if (f1.exists()) {
			System.out.println("File is already created");
		} else {
			System.out.println("new File created");
		}
		System.out.println("File is already exists in " + f1.exists());
	}
}
