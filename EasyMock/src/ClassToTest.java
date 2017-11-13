/**
 * EasyMock example
 * This is the class that we're trying to test.  It has a dependency on
 * an object of type DependencyInterface.  For unit tests, we don't want
 * to involve a real object (which might not exist yet, or might need unit
 * tests of its own), but for integration tests we would want a real object
 * @author gosnat
 *
 */
public class ClassToTest {

	/** The object we're depending on */
	private DependencyInterface myDependency;
	
	/**
	 * Constructor injection
	 * @param d the object fulfilling the dependency
	 */
	public ClassToTest(DependencyInterface d) {
		myDependency = d;
	}
	
	/**
	 * This is the method we want to test in our unit tests
	 * Not doing anything fancy in this example, but note that it
	 * does depend on what object we have in place
	 * @return true if the dependency object is supplying a negative value
	 */
	public boolean isDependencyNegative() {
		return myDependency.getValue() < 0;
	}
}
