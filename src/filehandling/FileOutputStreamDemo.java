package filehandling;

import java.io.FileOutputStream;

/*
 * FileOutputStream :
	Earlier, you learned how to write text to files using FileWriter.

	The FileOutputStream class works in a similar way, but it writes data as raw bytes. 
	That means you can use it not only for text files, 
	but also for binary files (like images, PDFs, or audio).
*/
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String text = "useless things build us useless";
		try (FileOutputStream fOutputStream = new FileOutputStream("student.txt")){
			fOutputStream.write(text.getBytes());
			
			System.out.println("Success !!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
