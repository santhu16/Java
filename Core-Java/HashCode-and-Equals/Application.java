// Using the Equals Method.

//To generate hashcode and equals, Create your desired instance variable, right click on the editor, go to 
//source and click on Generate hashcode() and equals();


class Select {
	private int ID;
	private String name;

	public Select(int id, String name) {
		this.ID = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Select [ID=" + ID + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
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
		Select other = (Select) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class Application {

	public static void main(String[] args) {

		Select Select1 = new Select(5, "Gautham");// If person has same id and name, doesn't mean they are equal
		Select Select2 = new Select(5, "Gautham");// Because they are pointing to different objects in different
		                                          // locations.

		// Select2 = Select1; If this assignment is done, then it means that both point to the same object.
		
		System.out.println(Select1 == Select2); // Checking if Select1 and Select2 are referring to the same object.
		                                        // This is reference.
		System.out.println(Select1.equals(Select2));// This is meaning

		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2); // Double doesn't point to same objects.
		System.out.println(value1.equals(value2));

		int value3 = 7;
		int value4 = 7;
		System.out.println(value3 == value4); // Integer Points to same objects.

		String text1 = "hello";
		String text2 = "hellopdf".substring(0, 5);

		System.out.println(text1 == text2); // Reference meaning, points to different objects.
		System.out.println(text1.equals(text2)); // Actual Meaning

	}
}
