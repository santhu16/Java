// Data Encapsulation: Hiding instance variables so that other classes can't access it.
// In this method, we use getters and setters to access the private variables.

class App {
	private String name;
	public static final int ID = 10;

	public String getData() {
		String data = "The final value is: " + getID();
		return data;
	}

	private int getID() { //Private method
		return ID + 9;
	}

	public String getName() { // returns name of the private variable;
		return name;
	}

	public void setName(String name) { // Sets the value of the copy of the private variable.
		this.name = name;
	}
}

public class Application {
	public static void main(String[] args) {
		App app = new App();
		app.setName("Gautham");
		
		System.out.println(app.getName()); 
		System.out.println(app.getData());
	}
}
