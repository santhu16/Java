//Setter Methods

class Info {
	private String name; // Instance variables
	private int age;

	public void this_name(String name) { 
		this.name = name;
	}

	public String getName() { // Getter methods with return values doesn't receive arguments
		return name;
	}

	public int getAge() { // Getter method
		return age;
	}
	
	public void setName(String NewName) { // Setter Method, Doesn't return anything.Assigns instance variable.
		name = NewName; // to a new variable so that we don't meddle with it.
	}

	public void setAge(int NewAge) { // Setter method receives arguments
		age = NewAge;
	}

	@Override
	public String toString() {
		return "Name: " + name + "; Age: " + age;
	}

	public void setter(int age, String name) { // Setter, using one setter method that merges two setters.
		setName(name);
		setAge(age);
	}
}

public class Application {

	public static void main(String[] args) {
		Info Info1 = new Info(); // Creating an Info Object.

		// Info1.name = "Gautham";
		// Info1.age = 25; // We cannot directly set or access the internal variables
		                   // since they are set to private.

		// System.out.println(Info1.age);
		// System.out.println(Info1.name); //Prints only if the instance
		// variables in the classes are available.
		// Doesn't print if instance variables is/are private.
		// Private keyword encapsulates the instance variables.

		// System.out.println(Info1.getAge()); // Accesses the instance variables using the Get Method.
		// System.out.println(Info1.getName());

		Info1.setName("Gautham"); // Setter method, sets the instance variables to a particular string or value.
		Info1.setAge(23);

		System.out.println(Info1.getAge()); // Accesses the updated instance variables using the Get Method.
		System.out.println(Info1.getName());
		System.out.println(Info1.toString());

		// or you can type both in one statement

		Info1.setter(22, "Avinash"); // using a single set method to invoke 2 setter methods.

		System.out.println(Info1.getAge()); // Accesses the updated instance variables using the Get Method.
		System.out.println(Info1.getName());
		System.out.println(Info1.toString());

	}

}
