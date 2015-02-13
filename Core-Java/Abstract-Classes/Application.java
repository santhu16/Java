//Using Abstract classes
//Parent is an abstract class and all the child classes must implement the parent methods.
//An Abtract class can have non-abstract methods as well.
//An abstract class provides no implementations.
//In this example, we consider three entities; Loki, Thor and Odin. Odin is the parent, Thor and Loki are his children respectively.

public class Application {
	public static void main(String[] args) {
		
		// Odin Odin1 = new Odin(); // When the Parent class is abstract, it can't be instantiated.
		//The Odin type can't be instantiated(i.e., an abstract parent class object cannot be created).

		//Here, we are creating two objects of type Thor and Loki
		Thor Thor1 = new Thor();
		Loki Loki1 = new Loki();

		Thor1.setId(5);
		Loki1.setId(10);

		System.out.println(Thor1.getId());
		System.out.println(Loki1.getId());

		Thor1.run();
		Loki1.run();

	}
}
