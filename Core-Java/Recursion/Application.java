// Calculating the Factorial of a value using Recursion.

public class Application {

	public static void main(String[] args) {

		System.out.println("The Factorial of the value(by recursion) is : " + factorial(6)); 
		// Passes value 6 into the factorial method
		// Expected output : 6*5*4*3*2*1 = 720;
	}

	public static int factorial(int value) {
		//System.out.println(value);
		if (value == 1) { // Check if Value = 1; If so, return 1;
			return 1;
		}
		return factorial(value - 1) * value;
	}
}
