//Polymorphism is the provision of a single interface to entities of different types.
//When you call a class method, the type of the variable is very important.
//When you call a same method present in both variables, the reference is important.

class Parent {
	public void ramble(){
		System.out.println("Parent Rambling"); // Parent Method 
	}
}

class Child extends Parent{ // Child is a subclass of  and is derived from 
                            // Parent due to the extend method 

public void ramble() {
System.out.println("Child Rambling"); // Child Class Method overridden from parent class
}

public void murmur(){
	System.out.println("Mwuaaahhh");
	}
}

public class Application {
	public static void main(String[] args) {
		
		Parent Parent1 = new Parent(); // Creates new object Parent1 of Type Parent
		Child Child1 = new Child();    // Creates new object Child1 of Type Child
		
		/*Child Child2 = new Parent(); You cannot cast a parent class to a child class.*/
		
		Parent Parent2 = Parent1; // Parent2 refers to Parent1(which is of type Parent) so it implements parent method
		Parent Child2 = Child1;   // Child2 refers to Child1(which is of type Child) so it implements Child method
		
		Parent2.ramble(); // Implements Parent method since it is pointing to parent class.
		Child2.ramble();  // Child2 of type parent implements Child method since it is pointing to child class.
		
		Parent1.ramble(); // Implements Parent method since it is pointing to parent class.
		Child1.ramble();  //Implements Child method since it is pointing to child class.
		
		/*Parent Parent3;
		Parent3.ramble(); //Uninitialized variable not pointing to a certain method.
		*/	
		Child1.murmur();  //Type child, Implements child method

		//Child2.murmur(); Although child2 Refers to Child1(which is Child Class),
		//While calling a specific method pertaining to a class, the type matters.
	
		//If parent and child class have the same method(overwritten in child), the method to which
		//the variable is pointing to is called.
		}
}
