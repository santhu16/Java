// Using Inner classes such as Non-Static Classes, Static Classes, and Classes inside Methods.

//Key things: 

// If you want to access a static class inside a class use the dot operator(.) and then access the methods
// If you want to access a non-static method inside the class, create a common method, where you can create a
//new non-static object and access the methods from that object.

class Humans {

	private int id;
	private String name;
	final int building = 30;

	public Humans(int id, String name) { // Constructor to initialize the state of the variable.
		this.id = id;
		this.name = name;
	}

	// Using static class inside a class.

	public static class Listen { // static class
		public void listen() {
			System.out.println("I am listening");
		}
	}

	// Using non-static Classes inside a class
	class Speech {
		public void speak() {
			System.out.println("Hi, My name is: " + name + " \nMy user id is: "
					+ id + "\nI have access to building: " + building);
		}
	}
	
	public void do_methods() { // Use a common method inside a class where 
        // you can implement methods of non-static inner class
		Speech speech = new Speech();
		speech.speak();
		}
	}

public class Application {
	public static void main(String[] args) {
		Humans humans = new Humans(10, "Gautham Honnavara");
		humans.do_methods(); // Using a method inside class to implement non-static inner class methods.
		
		Humans.Listen humans1 = new Humans.Listen();
		humans1.listen(); // Accessing a static class using (.) . Since it is
							// non-static, we could use (.) operator.
	}
}
