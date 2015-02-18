import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

//Writing Objects to a File.

public class WritingObjects {
	public static void main(String[] args) {
		System.out.println("Writing Files...");
		
		Application[] robot = {new Application(1,"Gautham"),new Application(2, "Avi"), new Application(3, "Mani")};
		ArrayList<Application> robot1 = new ArrayList<Application>(Arrays.asList(robot));// Using array list.
		
		try(FileOutputStream fs = new FileOutputStream("example.bin")){ // Writing file to a location
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(robot); // 1st method to write objects in array.
			os.writeObject(robot1);// 2nd Method to write objects in the arraylist.
			os.writeInt(robot1.size());
			for(Application robot2:robot1)
			{
				os.writeObject(robot2);
			}
			
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
