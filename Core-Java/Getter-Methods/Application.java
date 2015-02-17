//Using Methods to return a Certain Value - Getting Values
//Getter methods are used to return a particular instance variable. 
// They are generally used if the instance variables are set to private and cannot be accessed outside the class.


class Person{
	
	String name; // Data or Instance Variables.
	int age;
	
	void speak(){
		System.out.println("My name is " + name + " and my Age is " + age + "!!");// Prints after being invoked
	}
		
	void retirementAge(){
		int years_left_for_retirement = 65-age; // Calculate years left for retirement
		System.out.println(name + "'s Retirement age is " + years_left_for_retirement); // Print Retirement Age
	}
	int retirementAge_using_return_values(){
		int years_left_for_retirement = 65-age; // Calculate years left for retirement
		return years_left_for_retirement; // This method is no longer a method since it returns a value 
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	}


public class Application {

	public static void main(String[] args) {
		
		
		Person Person_1 = new Person();
		Person_1.name = "Gautham Honnavara Srinivasan";
		Person_1.age  = 23;
		
		Person Person_2 = new Person();
		Person_2.name = "Joe Hage";
		Person_2.age  = 46;
		
		//Person_1.speak();// invoking method
		//Person_1.retirementAge(); 
		//Person_2.speak();
		//Person_2.retirementAge();
		
		int Person1_Age = Person_1.retirementAge_using_return_values(); // RHS is actually a return Value not a method
		//System.out.println("Years for " + Person_1.name +  "'s Retirement: ");
		//System.out.println(Person1_Age);
		
		int Person2_Age = Person_2.retirementAge_using_return_values(); 
		//System.out.println("Years for " + Person_2.name + "'s Retirement: ");
		//System.out.println(Person2_Age);
		
		int age1 = Person_1.getAge(); // Getter methods
		String name1 = Person_1.getName();
		int age2 = Person_2.getAge();
		String name2 = Person_2.getName();
		
		System.out.println(name1); // Printing the variables that have accessed getter methods.
		System.out.println(age1);
		System.out.println(name2);
		System.out.println(age2);
		
		System.out.println(Person_1.getName()); // Getting instance variable values directly using the getter method.
		System.out.println(Person_1.getAge());
		System.out.println(Person_2.getName());
		System.out.println(Person_2.getAge());
		
		
	}

}
