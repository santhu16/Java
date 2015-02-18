import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Writing Objects to a File.

public class WritingObjects {
	public static void main(String[] args) {
		
		Application Application1 = new Application(14, "Gautham"); // Creating new objects and 
		Application Application2 = new Application(35, "Mani");// entering id and name for those objects
		
		System.out.println("Writing Objects ...");
		System.out.println(Application1); // Printing those two objects.
		System.out.println(Application2);
		
		try(FileOutputStream fs = new FileOutputStream("example.bin")){ // Writing file to a location
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(Application1); // Writing object 1 onto the file
			os.writeObject(Application2);// Weriting object 2 to the file
			
			os.close(); //Closing file
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
