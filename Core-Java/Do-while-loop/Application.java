//Do while loop. This is an exit condition loop where the loop runs the code block atleast once.
//Do while loop- In short, it means run a block of code continuously while(True).
//Keep asking user to enter a value until he enters the correct one.

import java.util.Scanner;
public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// Defining a scanner input
		int value;
		do { 
			// Keep Running the loop until user enters 5
			System.out.println("Please enter a value: ");// Asking the user to enter a value.
			value = input.nextInt();// Input prompt
		} while (value != 5);
		
		System.out.println();
		System.out.println("Congratulations you have entered the right code !!");
	}
}
