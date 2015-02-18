//Switch Statement
//Switch( as the name suggests) is used to switch between choices.

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any of the following commands - Start, Stop :");
		String Line = input.nextLine();
		switch (Line) {

		case "Start":
			System.out.println("Rebooting the PC");
			break;

		case "Stop":
			System.out.println("Shutting down");
			break;

		default:
			System.out.println("Command not recognized");
		}
	}
}
