//This is a class which resides in a different package

package Exterior;
public class Outside_Machine extends Parent {
	public Outside_Machine() {
		System.out.println(this.height); // Doesn't work since height is in a different package.
	}
}
