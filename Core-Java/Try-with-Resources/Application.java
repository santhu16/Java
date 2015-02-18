// Try with Resources is a new Feature in Java which doesn't include the cumbersome try and catch methods.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {

		File file = new File("C:/Users/Gauthamhs/Desktop/example.txt");
		// FileReader Fr = new FileReader(file);
		try (BufferedReader Br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = Br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: " + file.toString());

		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
	}
}
