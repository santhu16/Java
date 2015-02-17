// Handling Multiple Exceptions
// The program can handle only one exception at a time.

import java.io.IOException;
import java.text.ParseException;

class Test {
	public void tester() throws IOException, ParseException {
		 //throw new IOException("Seriously"); //The JVM can handle only one exception at a time.
		                                       //If one more exception is thrown, the code is unreachable.
		 throw new ParseException("Could not parse file ", 2);
	}
}

public class Application {
	public static void main(String[] args) {
		Test test = new Test();
		
		//Try catch method if you want to test the exceptions seperately.
		 try { test.tester(); } 
		 catch (IOException e) { 
		 System.out.println("Could not read file"); // Try Catch Method.. 
		 }catch (ParseException e) { 
		 System.out.println("Could not parse file"); }

		 //Try catch method to check exceptions simultaneously.
/*		try {
			test.tester();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}*/
	}
}
