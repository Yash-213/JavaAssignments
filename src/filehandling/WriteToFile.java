package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myFileWriter = new FileWriter("student.txt");
			myFileWriter.write("Do not write anything!!");
			myFileWriter.close();
			System.out.println("all write");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
