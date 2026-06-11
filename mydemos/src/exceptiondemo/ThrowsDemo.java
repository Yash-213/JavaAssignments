package exceptiondemo;

import java.io.*;

public class ThrowsDemo {
	static void readFile() throws IOException {
		FileReader fr = new FileReader("justFun.txt");
		fr.close();
	}
	public static void main(String[] args) throws IOException {
		readFile();
	}
}
