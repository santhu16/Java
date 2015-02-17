// Passing by value and by reference.

class Human {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}
}

public class Application {
	
	public void calculate(int value){
		System.out.println("2 - The value is: " + value); // The global value 10 is passed and printed.
		value = 100; // The local variable is set to 100
		System.out.println("3 - The value is: " + value); // The local value is printed. and its scope ends
		                         // before the braces.
	}
	
	public void showHuman(Human human){
		System.out.println("2: The name of the given human is " + human);
		//human.setName("Manikandan"); //This will set the reference of Gautham to Manikandan .
		human = new Human("Halley"); // New object Halley is created 
		//human.setName("Manikandan"); //This will set the reference of Halley to Manikandan
		System.out.println("3: The name of the given human is " + human); // Halley is called
	}
	
	public static void main(String[] args) {
		
	// Passing by Value
		
		Application application = new Application();
		int value = 10; // The global variable is set to 10;
		System.out.println("1 - The Value is: " + value); // Value 10 printed 
		application.calculate(value); // sysout inside the calculate methods are printed.
		System.out.println("4 - The Value is: " + value); // The global variable is still 10 and is printed.
		
	// Passing by Reference.
		
		Human human = new Human("Gautham"); // human of type Human is set to Gautham
		System.out.println(); // Blank Space
		System.out.println("1: The name of the given human is: " + human); // Gautham is printed
		application.showHuman(human); // Method is called 
		System.out.println("4: The name of the given human is " + human);
		
	}
}
