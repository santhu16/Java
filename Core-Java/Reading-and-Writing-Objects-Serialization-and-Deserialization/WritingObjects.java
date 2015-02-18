import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Writing Objects to a File.

public class WritingObjects {
	public static void main(String[] args) {
		System.out.println("Writing Files...");
		Application application1 = new Application(5, "Lala"); //Creating Objects
	
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("example.bin"))){ 
			// Writing file to a location. Writes the objects to a file in binary format.
			
			Application.setCount(56);
			os.writeObject(application1); // 1st method to write objects into file.
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
