//Exception Handling. 
//The program throws an exception if it couldn't handle certain aspects such as opening,reading the file

// import java.io.File;

// In this method we are trying to read a file from example.txt.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Please check the File again. ");
		}
	}
	
	public static void openFile() throws FileNotFoundException {
		File text_file = new File("example.txt");
		FileReader text = new FileReader(text_file);
		
	}
}
