//Natural ordering in Lists and Trees
//In trees you cannot add objects as Trees sort in natural order and wouldn't go inside the object
//to sort it.
//The various implementations in this program will allow you to sort objects in trees in natural order.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Enforcing Natural Ordering of ArrayList and TreeSet.
class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name: " + name;
	}

	public int compareTo(Person person) {
		return name.compareTo(person.name); // Use this so that you can add objects to the treeSet.
	}
}

/*
 * public int compareTo(Person person) { // Use this if you want to sort objects based on length. 
 * int len1 = name.length(); 
 * int len2 = person.name.length();
 * if(len1 > len2) { 
 * return 1; 
 * } 
 * else if(len1 < len2) { 
 * return -1; 
 * } else
 *  {
 * return name.compareTo(person.name);
 }
 //Return 0 will delete an element if it shares the same length with other element. This compares between two
 //lengths and determines what order should those two objects should be placed are equal, and only put one element in them. 
 //This will cause a conflict between the compareTo and Hash code and equals() method. Therefore we return the following step 
 //so that we can add objects in the tree set.
 */

public class Application {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Set<String> set = new TreeSet<String>();

		List<Person> list1 = new ArrayList<Person>();
		Set<Person> set1 = new TreeSet<Person>();

		System.out.println(list); System.out.println(set);
		  
		add_elements(list); add_elements(set);
		  
		 //System.out.println(list); // Arraylist is unsorted when elements are added
		  
		 Collections.sort(list);     //Sorting the Arraylist since its unsorted when elements are added initially.
		 
		 System.out.println(list); // Sorted ArrayList 
		 System.out.println(set);  // While adding elements, set is already sorted in the natural order.
		  
		 System.out.println(); show_elements(list); // Shows all the element one by one. 
		 System.out.println(); show_elements(set);
		 
		////////////////// Natural Ordering for Objects ////////////////////////////

		System.out.println(list1);
		System.out.println(set1);

		add_elements_objects(list1);
		add_elements_objects(set1);// Cannot add elements to tree set, Natural order not defined in objects.

		Collections.sort(list1); // Sorting the Arraylist since its unsorted when elements are added initially.

		System.out.println(list1); // Arraylist is unsorted when elements are added
		System.out.println(set1); // While adding elements, set is already sorted in the natural order.
		System.out.println();
		show_elements_objects(list1); // Shows all the elements one by one.
		System.out.println();
		show_elements_objects(set1);

	}

	private static void add_elements(Collection<String> coll) {

		coll.add("Susy");
		coll.add("Titan");
		coll.add("Nicole");
		coll.add("Pacer");
		coll.add("Vehemoth");
	}

	private static void show_elements(Collection<String> coll) {

		for (String elements : coll) {
			System.out.println(elements);
		}
	}

	private static void add_elements_objects(Collection<Person> coll) {

		Person person1 = new Person("Gerrard");
		Person person2 = new Person("Sterling");
		Person person3 = new Person("Suarez");
		Person person4 = new Person("Henderson");
		Person person5 = new Person("Mignolet");

		coll.add(person1);
		coll.add(person2);
		coll.add(person3);
		coll.add(person4);
		coll.add(person5);
	}

	private static void show_elements_objects(Collection<Person> coll) {

		for (Person elements : coll) {
			System.out.println(elements);
		}
	}
}
