// Inheritance.

// This means that if there are two classes, one class can inherit all the methods from another class
// by "extending" it and also can have its own methods.

// In this Program, Machine is the parent class, Car is the child class, and Car can have all the Machine 
// Methods by extending it as well as its own methods.

//Machine - parent class

class Machine {

	public void machine_start() {        // Machine's methods
		System.out.println("Starting Machine, Please wait..");
	}
	public void machine_stop() {
		System.out.println("Switching off Machine Ignition");
	}
}

//Child Class is the derived class and Machine_Parent is the Parent Class

class Car extends Machine{
	
/*	public void machine_start() {        
		System.out.println("Starting Car, Please wait..");
	}*/

	public void machine_stop() {
		System.out.println("Switching off Car Ignition"); // You can overwrite the Parent class methods.
	}
	
	public void car_break(){
		System.out.println("Car has broken down.."); //Child's own methods.
	}
}

public class Application {
	public static void main(String[] args) {
		
		Machine machine = new Machine(); // This is pointing to a machine object, so it implements machine class.
		Car car = new Car(); // This is pointing to a child object, so it implements child class.
		
		machine.machine_start(); //Implementing Machine Methods.
		machine.machine_stop();
		
		car.machine_start(); 
		car.machine_stop();
		car.car_break(); // Implementing Car Methods.
		
		/*machine.car_break();*/ 
		// This will not work for machine parent class as its undefined in its methods.
	}
}

