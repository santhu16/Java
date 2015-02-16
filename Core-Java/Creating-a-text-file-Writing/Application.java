// Creating and writing text files is very similar to reading from text files.
//Using try with resources that provides clarity with simple Exception Handling.
//The following program will create a text file called texter.txt and will write the following information as listed below.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {

		File file = new File("texter.txt");
		// FileReader Fr = new FileReader(file);
		try (BufferedWriter Br = new BufferedWriter(new FileWriter(file))) {

			Br.write("First Line !"); // Writing to a file
			Br.newLine();
			Br.write("Second Line !");
			Br.newLine();
			Br.write("Third Line !");

		} catch (IOException e) {
			System.out.println("Unable to write file: " + file.toString());
		}
	}
}
