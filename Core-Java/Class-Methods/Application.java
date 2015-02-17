class Person {
	
/*    Classes can contain
	 
    1. Data(such as Instance variables)
    2. Subroutines (methods)
    
*/
	
    // Instance variables (data or "state")
    String name;
    int age;
     
    //Subroutines( or methods)
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
     
    void sayHello() {
        System.out.println("Hello Sir!");
        }
    }
 
public class Application {
    public static void main(String[] args) {
 
        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Gautham Honnavara";
        person1.age = 37;
        person1.speak();
        person1.sayHello();
        
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Sam NotWorthington";
        person2.age = 20;
        person2.speak();
        person1.sayHello();
        
    }
}
