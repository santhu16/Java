//Reading Files from Text using a File Reader.
//Note: When reading the file, there are three steps: open,read,close. Always close the file.
//Better Practice is to read file using try with resources since the below code looks shabby with lots of try catch blocks.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Application {
	public static void main(String[] args) {
		
		String word ="C:/Users/Gauthamhs/Desktop/hello.txt"; // Write the location name
		File file = new File(word); // Creates a new File object passing the location as the argument.
		BufferedReader BR = null;
		
		try {
			FileReader text = new FileReader(file); //Filereader reads the file at that location
			 BR = new BufferedReader(text); // Efficient Reader of files.
			
			String line;
			while((line = BR.readLine())!=null){
				System.out.println(line);
			}
		}
		 catch (FileNotFoundException e) {
				System.out.println("Cannot find the file: " + file.toString() );
			}
			 catch (IOException e) {
				System.out.println("Cannot Read the file: " + file.toString());
			}
			finally{
				try {
					BR.close();
				} catch (IOException e) {
					System.out.println("Cannot Close the File" + file.toString());
				}
				 catch (NullPointerException ex){
					System.out.println(" Not pointing to anything: " + file.toString());
				 }
			}
	}
}
