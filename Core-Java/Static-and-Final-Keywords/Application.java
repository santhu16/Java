// Static and Final Keywords.
// A static instance variable can be accessed by both static and non-static methods.
// However, a non-static variable can only be accessed inside a non-static method.

class Stats{
	
	public String Name; // Member variables
	public static String Description; // Static Variable, only belongs to class
	public final static int Lucky_Number = 10; // Final keyword is used to assign a static constant a value
	                                           // That cannot be changed.
	public static int count = 0; // Setting count = 0, count belongs to the class, so each object associated
	                             //with the class gets changed.
	public int id;              // setting an instance variable id, different for each class
	
	public Stats(){
		id = count;           // Assigning count to id
		count ++;             // Incrementing count
	}
	
	public void showName(){
		System.out.println(" Object Id: " + id + " " + Description + ": " + Name);// static and non-static 
		//instance variables executed in instance method.
	}
	
	public static void showInfo(){
		System.out.println("Hello"); //Print statement executed in static class
	}
	
	public static void showDesc(){
		System.out.println(Description); // Printing static variable in a static method
		//System.out.println(Name);//Name is non-static. Hence, it doesn't work inside static Method
	}
}

public class Application {

	public static void main(String[] args) {
		
		System.out.println("The count before initialization is: " + Stats.count);
		Stats Stats1 = new Stats();
		Stats Stats2 = new Stats();
		System.out.println("The count after initialization is: " + Stats.count);
		
		Stats.Description = "belongs to Class"; // Static variable can only be invoked by the class
		
		System.out.println(Stats.Description);
		Stats.showInfo(); 
		Stats.showDesc(); // invoking static variable using static method
		
		Stats1.Name = "bob";
		Stats2.Name = "sue";
		
		//System.out.println(Stats1.Name);
		//System.out.println(Stats2.Name);
		
		Stats1.showName();
		Stats2.showName();
		
		System.out.println(Math.PI); // Static variable
		//Math.PI = 3; //This is a final value and therefore a value cannot be assigned
		System.out.println(Stats.Lucky_Number); // Final static variable with value 10
		
	}
}
