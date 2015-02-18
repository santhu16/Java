//Serializing an Array of Objects.

import java.io.Serializable;

public class Application implements Serializable { // Application class implements Serializable interface 
	                                               // to serialize objects.
	private static final long serialVersionUID = 1704785874013355194L;
	private int id;  // Variables id and name
	private String name;
	
	public Application(int id, String name) {  //Constructor
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() { // Displaying the variable.
		return "Application [id = " + id + ", name = " + name + "]";
	}
}
