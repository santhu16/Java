//Using Interfaces.
//Use interfaces if different classes have to use the same method.
//Interfaces are abstract by default. Classes implementing interfaces have to implement the methods.

interface Interface {
	public void showData(); // Interfaces only have a header, no curly braces, and only has the method
                            // which can be customized by other classes. 
}

class Car implements Interface {
	
	public void car_start(){
		System.out.println("Starting car.. ");
	}
	public void car_stop(){
		System.out.println("Switching off Ignition...");
	}
	public void showData() {
		System.out.printf("The value of the car is %d%n", 25000); //Car implementing Interface method.
	}
}

 class Machine implements Interface {
	private String name;
	
	public Machine(String name) {
		this.name = name;
	}

	public Machine() {
	}

	public void machine_start(){
		System.out.println("Machine Loading, Please wait ... ");
	}
	
	public void machine_stop(){
		System.out.println("Shutting Down ");
	}
	
	public void showData() {
		System.out.printf("The name of the Machine is %s%n", name); //Machine implementing interface method.
	}

}

public class Application {
	public static void main(String[] args) {

		Machine machine_1 = new Machine();
		Machine machine_2 = new Machine("Gautham");
		
		Car car = new Car();
		
		machine_1.machine_start();
		machine_1.machine_stop();
		machine_1.showData();
		machine_2.showData();
		
		car.car_start();
		car.car_stop();
		car.showData();
	}
}
