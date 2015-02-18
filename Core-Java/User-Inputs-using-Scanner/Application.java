//Entering User Inputs using Scanner keyword.

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a text: ");
		String text = scanner.nextLine(); // User can input a String using this statement.
		System.out.println("You have entered the following text: " + text);
	}
}
