package filehandling;

import java.io.FileInputStream;

/*FileInputStream
	So far, you have used the Scanner class to read text files. 
	Scanner is very convenient for text because it can split input into lines, words, or numbers. 
	However, sometimes you need more control. 
	For example, when reading binary data (like images, audio, or PDFs), 
	or when you need full control of raw bytes. In those cases, you use FileInputStream.
*/
public class FileInputStreamDemo {

	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("student.txt")) {
			int i;
			while((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
