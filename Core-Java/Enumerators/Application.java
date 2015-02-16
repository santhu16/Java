public class Application {
		
	public static void main(String[] args) {

/*// Classic Method
		 
      In classic method, Colour names will be assigned an integer and will be used in switch cases.
		
            public static final int ORANGE = 0;
	    public static final int BLUE = 1;
	    public  static final int GREEN = 2;
	    public  static final int YELLOW = 3;
		
		int colour = 2;
		
		switch(colour){
		case ORANGE: System.out.println("The colour is Orange");
		             break;
		case BLUE:   System.out.println("The colour is Blue");
		             break;
		case GREEN:  System.out.println("The colour is Green");
		             break;
		case YELLOW: System.out.println("The colour is Yellow");
		             break;
		default:     System.out.println("colour not found");
		             break;
		}
		*/
		
		//Using the Enumerator Method 
		
		//In the enumerator method an enum Colours is defined and the enumerators are assigned a value
		// indicated in hyphens.
		
		Colours colour = Colours.Violet; // colour is of enum Colours and assigning the colour violet to it.
		
		switch(colour){
		
		case Violet:   System.out.println("The colour is Violet");
		               break;
		
		case Indigo:   System.out.println("The colour is Indigo");
		               break;
		              
		case Blue:     System.out.println("The colour is Blue");
		               break;
		               
		case Green:    System.out.println("The colour is Green");
		               break;
		               
		case Yellow:   System.out.println("The colour is Yellow");
		               break;
		               
		case Orange:   System.out.println("The colour is Orange");
		               break;
		               
		default:       System.out.println("colour not found");
		               break;
		}

		System.out.println(Colours.Blue); // Shows the enum variable when tostring() is not called.
		                                  // o/p: tostring(), if not Blue
		System.out.println(Colours.Blue.getClass()); // Displays the class that the color blue belongs to.
		                                             // o/p: Colours
		System.out.println(Colours.Blue.getName());  // Displays the name assigned to enum variable.
		                                             // Gives the value of Enumerators.
		System.out.println(Colours.Blue.name());     // Displays the name of enum variable from java.lang.
		                                             // o/p Blue
		System.out.println(Colours.Blue); // Displays toString() instead of enum variable.
		
		System.out.println(Colours.Blue instanceof Colours); // Compares whether the Blue object belongs to  
		                                                     // colours class
		
		
		
		

	}

}
