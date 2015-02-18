import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//Reading Objects to a File

public class ReadingObjects {
	public static void main(String[] args) {
		System.out.println("Reading Files...");
		try(FileInputStream fs = new FileInputStream("example.bin")){// reading file from a location
			
			ObjectInputStream os = new ObjectInputStream(fs);
			Application[] robot = (Application[])os.readObject(); // Reading objects.
			@SuppressWarnings("unchecked")
			ArrayList<Application> robot1 = (ArrayList<Application>)os.readObject();
			
			for (Application robots:robot) // value robots in robot , print robots.
			{
				System.out.println(robots); // 1st method of reading objects just using arrays.
			}
			
			for (Application robots1:robot1) // value robots1 in robot1 , print robots1.
			{
				System.out.println(robots1); // 2nd method of reading objects using arraylist.
			}
			
			int num = os.readInt();
			for(int i = 0;i<num;i++)
			{
				Application robot2 = (Application)os.readObject();
				System.out.println(robot2);  //3rd method of reading objects.   
			}
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
