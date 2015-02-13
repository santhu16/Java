// Public,Protected,No access Modifier and Private Class. Arranged in order of restrictiveness.
// Least-Highest Restrictiveness.
// Public------------Protected-----------No Access Modifier-----------Private.

public class Parent {
	public String name; // The string name can be accessed anywhere. However,
	                    // this is considered bad practice.
	                    // Best practice is to make variables private and use getters
	                    // and setters to get or set their values.
	public final static int ID = 8; // Final constant. Can be accessed anywhere but the value cannot be changed since its final. 
	                                // Therefore, it is considered good practice.
	protected String size; // size is protected. Can be accessed from anywhere within a package, 
	                       // or from sub-classes from different package.
	int height; // No access modifier. Can be accessed anywhere within a package. 
	            // Outside packages cannot access this variable.
	private String text; // Text variable is private. Can only by used within the class Parent.

	public Parent() {
		this.name = "freddy"; // setting the default value of name to freddy
		this.size = "Medium"; // setting the default value of size to Medium
		this.height = 8;      // setting the default value of height to 8
	}
}
