//Method Parameters.
//Passing parameters into the method arguments.

class General {

	public void sprint(int height, int distance) {
		System.out.println("The height is: " + height + " and the distance is: " + distance);
	}

	public void letter(String text, int numbers) {
		System.out.println(text + ", Numbers received: " + numbers);
	}
}

public class Application {
	
	public static void main(String[] args) {
	
		General person = new General();
		person.sprint(7, 8); // Here we are passing two integers, a height and a distance as an argument.

		String message = "You have unread e-mail messages";
		person.letter(message, 10); // person.letter("you have unread e-mail messages" , 10); 
		// Here we are passing a text message and an integer to the submethods.
		
		// We can point the message to a string and then pass that message instead of passing
		// the whole string itself.

	}
}
