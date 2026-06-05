package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

/*BufferedReader and BufferedWriter make reading and writing text files faster.

 - BufferedReader lets you read text line by line with readLine().
 - BufferedWriter lets you write text efficiently and add new lines with newLine().
These classes are usually combined with FileReader and FileWriter, which handle opening or creating the file. The buffered classes then make reading/writing faster by using a memory buffer.*/
public class BufferFile {
	public static void main(String[] args) {
		try (BufferedReader bReader = new BufferedReader(new FileReader("student.txt"))){
			String line;
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
