import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Reading Objects from a File

public class ReadingObjects {
	public static void main(String[] args) {
		
		System.out.println("Reading Objects...");
		try(FileInputStream fs = new FileInputStream("example.bin")){// reading file from a location
			
			ObjectInputStream os = new ObjectInputStream(fs);
			Application Application_1 = (Application)os.readObject(); // Reading objects.
			Application Application_2 = (Application)os.readObject();
			
			System.out.println(Application_1);
			System.out.println(Application_2);

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
