// Generics and Wild Card. 

import java.util.ArrayList;

class Parent{

	@Override
	public String toString() {
		return "I am a Parent";
	}
	
	public void speak(){
		System.out.println("Hello Sir.");
	}
	
}

class Child extends Parent{
	
	@Override
	public String toString() {
		return "I am a Child.";
	}
	
	public void rumble(){
		System.out.println("Hello Mom");
	}
}

public class Application {
	public static void main(String[] args) {
		ArrayList<Parent> List1 = new ArrayList<Parent>(); //Array List
		
		List1.add(new Parent());
		List1.add(new Parent()); // Creating new Parent object and adding it to the list.
		
		ArrayList<Child> List2 = new ArrayList<Child>(); //Array List
		
		List2.add(new Child());
		List2.add(new Child());
		
		//// Test Cases ////
		
		//showList1(List1); 
		//showList2(List1);
		//showList3(List1);
		//showList1(List2);
		//showList2(List2);
		//showList3(List2);
		
	}


public static void showList1(ArrayList<? extends Parent> list) { // First wildcard(?) where Parent class
	                                                             // and all its methods are used.
    for (Parent value : list) {
        System.out.println(value);
        value.speak();
        //value.rumble(); Undefined for type parent.
      
    }

}
 
public static void showList2(ArrayList<? super Child> list) { // Second wildcard using child class
	                                                          // where parent methods dont work
    for (Object value : list) {
        System.out.println(value);
         //((Child) value).rumble(); //Parent Cannot be cast to child
        
    }
}
 
public static void showList3(ArrayList<?> list) { // Third wildcard, which could use any of the classes.
    for (Object value : list) {
        System.out.println(value);
        //((Child) value).rumble(); Parent Cannot be cast to child
    }
}
}
