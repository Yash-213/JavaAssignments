package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
BufferedWriter :
	The BufferedWriter class is used to write text to a file, 
one line or one string at a time. If the file already exists, 
its contents will be replaced (overwritten).*/
public class WriteBufferFile {

	public static void main(String[] args) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt"))){
			bufferedWriter.write("So i am not writing anything 😂");
			bufferedWriter.newLine();
			bufferedWriter.write("Shut Up");
			System.out.println("work done successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
