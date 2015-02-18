import java.util.ArrayList;
import java.util.HashMap;

public class Application {
	public static void main(String[] args) {

		// Java 5
		
		ArrayList list = new ArrayList ();
		
		list.add("Mango");
		list.add("Orange");
		list.add("Peach");
		
		//String show_list = list.get(1); // Get would return an object instead of value, therefore casting was required.
		
		String show_list = (String)list.get(1); // Casting was required in Java 5
		System.out.println(show_list);
		
		// Modern Application
		
		ArrayList<String> List = new ArrayList<String>(); // Generics use parameterized <> keyword.
		
		List.add("Brotherhood"); 
		List.add("Revelations");
		List.add("Unity");
		
		String show_List = List.get(2);
		System.out.println(show_List);
		
		// java 7
		
ArrayList<String> List1 = new ArrayList<>();
		
		List1.add("Ghost");
		List1.add("BLack Ops");
		List1.add("Modern Warfare");
		
		String show_List1 = List1.get(0);
		System.out.println(show_List1);
	}
}
