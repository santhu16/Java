// Reading files from a text using Scanner Keyword.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Reading files using scanner.

public class Application {
	public static void main(String[] args) throws FileNotFoundException {
		// Enter correct location of the document. If not, throw an exception.

		String read_file = "C:/Users/Gauthamhs/Desktop/example.txt"; // Enter the location in the form of text
		File text_file = new File(read_file); // Create a new file object of that string to say that it is a file
		Scanner text = new Scanner(text_file); // Create a scanner object of that file in order to read it.
		int value = text.nextInt(); // Read the integer value.

		int count = 1;
		System.out.println(count + ": " + value);
		count = 2;
		text.nextLine(); // To skip the white space.

		while (text.hasNextLine()) { // If the file has a next line
			String lines = text.nextLine(); // Read the next line
			System.out.println(count + ": " + lines); // Print, keep doing until there are no lines.
			count++; // Increase the count.
		}
		text.close(); // Close the file
	}
}
