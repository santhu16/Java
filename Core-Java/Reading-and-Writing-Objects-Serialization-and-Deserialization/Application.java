// Using the transient keyword and non-serializable stuffs.

import java.io.Serializable;

public class Application implements Serializable { // Application class implements Serializable interface to serialize objects.

	private static final long serialVersionUID = 1704785874013355194L; //You must read the file with the
	//exact same class that you wrote the file with.
	private transient int id;  // Transient prevents serialization(Writing objects to a file).
	private String name;
	private static int count; // Static variables are non-serializable.
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Application.count = count;
	}

	public Application(int id, String name) {  //Constructor
		this.id = id;
		this.name = name;
		System.out.println("This is the beginning !"); // During deserialization constructors do not work.
	}

	public Application() {
		System.out.println("This is the End !");
	}

	@Override
	public String toString() { // Displaying the variable.
		return "Application [id = " + id + ", name = " + name + "], Count is: " + count;
	}
}
