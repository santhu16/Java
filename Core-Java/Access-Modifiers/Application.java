//Access Modifiers 

// Summary : 

/*
public: can be accessed everywhere.
protected: Can be accessed within a class,within the same package, within a subclass with same or different packages.
No Access Modifiers : Also called package private,can be accessed anywhere within a package but not in different packages.
private: can only be accessed inside a class. Even a sub class cannot access the private instance variables.
*/

public class Application {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(parent.name); // Name is public and therefore can be accssed from anywhere.
		System.out.println(parent.ID);   // Id is public. Therefore it can be accessed from anywhere.
		                                 // However, its value cannot be changed because it's set to final.
		
		//System.out.println(parent.text); // Text type is private, and therefore works only within a class
		System.out.println(parent.size);   // Size is protected. Accessible within a class,
		                                   // different classes in the same package, and sub-class from
		                                   //a different package.
		
		System.out.println(child.size); // Child classes can access variables of parent class if the variables are public,protected or default variables.
		System.out.println(child.height);
	}
}
