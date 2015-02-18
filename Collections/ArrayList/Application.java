//Array List 

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {

		ArrayList<Integer> value = new ArrayList<Integer>(); // Creating a new Arraylist Object.

		// Adding Values to the ArrayList.

		value.add(30);
		value.add(60);
		value.add(100);

		// Getting a value from the ArrayList.
		try {
			System.out.println(value.get(2) + "\n");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index is out of range: " + e
					+ ".\nPlease enter a correct index.");
		}

		// Getting all values from the Array List
		// 1st Method
		System.out.println("Loading First Iteration....\n");
		for (Integer i = 0; i < value.size(); i++) {
			System.out.println(value.get(i));
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

		value.remove(value.size() - 1); // Removes the last value in the array.
		value.remove(0); // Removes the first value in the array.

		System.out.println("\nLoading Final Iteration....\n");
		for (Integer value : values) {
			System.out.println(value); // in a list of 3 variables, the first and last one are deleted 
			                            // and only the middle one remains.
		}
	}
}
