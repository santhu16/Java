//Array List 

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<Integer>(); // Creating a new Arraylist Object.

		// Adding Values to the ArrayList.

		values.add(30);
		values.add(60);
		values.add(100);

		// Getting a value from the ArrayList.
		try {
			System.out.println(values.get(2) + "\n");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index is out of range: " + e
					+ ".\nPlease enter a correct index.");
		}

		// Getting all values from the Array List
		// 1st Method
		System.out.println("Loading First Iteration....\n");
		for (Integer i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
		// 2nd Method
		System.out.println("\nLoading Second Iteration....\n");
		for (Integer value : values) {
			System.out.println(value); 					
		}

		// 3rd Method
		System.out.println("\nLoading Final Iteration....\n");
		for (Integer value : values) {
			System.out.println(values); //Displays the array. 
		}

		// Removing Values from ArrayList.

		values.remove(values.size() - 1); // Removes the last value in the array.
		values.remove(0); // Removes the first value in the array.

		System.out.println("\nLoading Final Iteration....\n");
		for (Integer value : values) {
			System.out.println(value); // in a list of 3 variables, the first and last one are deleted 
			                            // and only the middle one remains.
		}
	}
}
