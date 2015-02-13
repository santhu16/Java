public class Child extends Parent {
	public Child(){
              //text ="tree";        // Child Class cannot access private instance variables of parent class
		this.size = "Large"; // Size is protected. Therefore,will work in a sub-class
		this.height = 10;    // Height is a default modifier. Therefore, will work since it is in the same package.
	}
}
