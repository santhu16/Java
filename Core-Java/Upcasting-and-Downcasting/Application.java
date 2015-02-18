//Upcasting and Downcasting.

//Upcasting : Parent pointing towards child
//Downcasting: Child pointing towards parent(Should point to a child object though), only then you can type-cast.

class Parent {

	public void speak() {
		System.out.println("Hello son");
	}
}

class Child extends Parent {

	public void speak() {
		System.out.println("Got it Dad ");
	}

	public void gruntle() {
		System.out.println("I cant talk now.");
	}
}

public class Application {
	public static void main(String[] args) {

		Parent Parent1 = new Parent();
		Child Child1 = new Child();

		Parent1.speak();
		Child1.speak();
		Child1.gruntle();

		// Upcasting

		Parent Parent2 = Child1; // This is Upcasting,
		// Parent2( Parent Class) pointing to Child(Polymorphism)

		Parent2.speak(); // Refers to Child1, so executes the speak() of Child Class
		// Parent2.gruntle();

		// Downcasting

		Parent Parent3 = new Child(); // Creating a new Child object using Parent Type
		Child Child2 = (Child) Parent3; // This is Child Class - Pointing to Parent to a Child Object

		Child2.speak();
		Child2.gruntle();

/*	    Parent Parent4 = new Parent(); // Creating a new Parent object.
		Parent Type Child Child3 = (Child)Parent4; // This is Child Class 
		Casting - Pointing to Parent to a Parent Object
		  
		Child3.speak(); Child3.gruntle();
		
		This doesn't work because Parent 4 creates a parent object and
		Child3( Child Object) is pointing to Parent3 of Parent object. 
		2 Classes having different objects cannot be casted.*/
	}
}
