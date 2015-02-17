//Classes and Objects.

class Person {
	String name; // Data or Instance Variables.
	int age;

	public void speak() { // Class method: May be invoked in the main program
		System.out.println("My name is " + name + " and my Age is " + age + "!!");
	}
}

public class Application {
	public static void main(String[] args) {

		Person Person_1 = new Person(); // Syntax for creating a new class object.
		Person_1.name = "Gautham Honnavara Srinivasan"; // Pointing the name of Person class to a string
		Person_1.age = 33; // Pointing the age of Person class to an integer value
		Person_1.speak();// Invoking class method

		Person Person_2 = new Person(); // Multiple Class objects can be created for a single class.
		Person_2.name = "Joe Hage"; 
		Person_2.age = 46;
		Person_2.speak();

		/*
		 * System.out.println(Person_1.name); System.out.println(Person_1.age);
		 * System.out.println(Person_2.name); System.out.println(Person_2.age);
		 */
	}
}
