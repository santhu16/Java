//Runtime vs Checked Exceptions.
//The main difference between Runtime and Checked Exceptions is that you don't necessarily need to handle
//Runtime exceptions. However, it is always good to do so.
//In this program, we will discuss Null Pointer, Arithmetic and ArrayIndexOutOfBounds Exceptions.
//Note: If an exception is not handled by the program, the rest of the code is unreachable.

public class Application {

	public static void main(String[] args) {

		// Null pointer exception ....
		String text = null;

		try{
			System.out.println(text.length());
			 }//Applying methods on a null value will throw a null pointer exception
		catch(NullPointerException e){
			System.out.println("This is a Null Pointer Exception");
		}

		// Arithmetic exception ... (divide by zero)
		
		int value = 7 / 0;
		System.out.println(value); //Runtime Exception(Arithmetic) not handled by the program.

		// You can actually handle RuntimeExceptions if you want to.
		
		// for example, here we handle an ArrayIndexOutOfBoundsException
		
		String[] texts = { "one", "two", "three" };

		try {
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
	}
}
