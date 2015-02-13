//Anonymous Classes - Used for (A) Extending an existing parent class without writing a child class
//                             (B) Using an interface without writing a separate class. 

//In anonymous class, you don't need to specify a name to a class.

//Note: You can't instantiate an interface directly i.e., in Interface infy = new Interface() is not allowed, 
//but you can instantiate a class that implements that interface:

//In this below method, we create an instantiation of anonymous class that implements the Interface and therefore
//its valid.

class Parent {
	public void talk() {
		System.out.println("Hello son !!");
	}
}

interface Info{
	public void connection();
}

public class Application {
	public static void main(String[] args) {
		
		Parent Parent1 = new Parent();
		Parent Parent2 = new Parent(){
			@Override
			public void talk() {
				System.out.println("I'm sorry, Did you say something. "); // Using Anonymous Class to write a 
				//child class without a name and overriding the method implemented in the parent class.
			}
		};
		
		Info Parent3 = new Info(){
			@Override
			public void connection() { // Using an anonymous class to override an interface.
					System.out.println("I'm trying to connect ...");
			}
		};
		
                Parent1.talk();         // Implementing the talk method using the parent class.
		Parent2.talk();         // Implementing the talk method for a child class using the anonymous class.
		Parent3.connection();   // Implementing the interface connection() method using anonymous class.
	}
}
