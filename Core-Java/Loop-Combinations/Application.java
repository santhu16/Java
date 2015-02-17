//Combination of While and if loops

public class Application {
	
	public static void main(String[] args) {
		int count = 0;
		while (true) { // This runs indefinitely
			System.out.println("Hi, I am counting on it: " + count);
			if (count == 10) { // If count = 10, it will break the loop and exit.
			break;
			}
			count++;
		}
	}
}
