//Serialization and Deserialization
//Serialization: Writing objects to a stream of bytes(binary format).
//Deserialization: Converting the stream of bytes back to the original objects.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Reading Objects from a File

public class ReadingObjects {
	public static void main(String[] args) {
		System.out.println("Reading Files...");
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("example.bin"))){
			// reading objects from a serialized file.
			Application application1 = (Application)os.readObject();
			System.out.println(application1);
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
