//Simple If loop.
//IF loop tests for a condition if its true or false.
//There are three keyword in IF - if,else if, else
//Below are some of the test cases.

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		System.out.println("Please enter a integer between 0-9: ");
		
		Scanner scanner = new Scanner(System.in); // Scanner allows you to enter an input.
		int value = scanner.nextInt(); // Determines the input data type you'll be entering.
		
		if (value <= 3) {
			System.out.println("The value is less than or equal to 3");
		} else if (value > 3 && value <= 6) {
			System.out.println("The value is greater than 3 and  less than or equal to 6");
		} else if (value > 6 && value <= 9) {
			System.out.println("The value is greater than 6 and less than equal to 9 ");
		} else {
			System.out.println("The value is greater than 9");
		}
	}
}
