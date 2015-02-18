//Hashmaps
//They have key and values. The values can be retrieved using the keys and vice versa.

import java.util.HashMap;
import java.util.Map;

public class Application {
	public static void main(String[] args) {

		// Hashmap Syntax
		HashMap<Integer, String> mapping = new HashMap<Integer, String>();

		// Adding key-value pairs into the HashMap using put.

		mapping.put(1, "Violet"); // Maps have a key and a value.
		mapping.put(7, "Red");
		mapping.put(3, "Blue");
		mapping.put(4, "Green");
		mapping.put(2, "Indigo");
		mapping.put(6, "Orange");
		mapping.put(5, "Yellow");

		// mapping.put(6, "White"); //Adding a duplicate key will overwrite the
		// previous key.

		// Getting all the String values using get()
		// Displaying all the String values corresponding to the keys .

		System.out.println(mapping.get(1));
		System.out.println(mapping.get(2));
		System.out.println(mapping.get(3));
		System.out.println(mapping.get(4));
		System.out.println(mapping.get(5));
		System.out.println(mapping.get(6));
		System.out.println(mapping.get(7));

		System.out.println();
		
		//Ways of displaying the keys and the values

		for (Map.Entry<Integer, String> entry : mapping.entrySet()) { //Entry set has a set of key and values. You have to extract 
		                                                              //the key and values seperately.
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}

		System.out.println();

		for (Integer key : mapping.keySet()) { //Maping keyset contains all the keys.
			String value = mapping.get(key); //mapping.getkey() gets the values pertaining to the key.
			System.out.println(key + ": " + value);
		}
	}
}
