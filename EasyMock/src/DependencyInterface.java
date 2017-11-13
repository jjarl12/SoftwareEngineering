/**
 * An interface describing the dependency
 * @author gosnat
 *
 */
public interface DependencyInterface {
	/**
	 * A method involved in the unit tests of ClassToTest
	 * @return some unknown int value
	 */
	public int getValue();
	
	/**
	 * Some method that isn't involved in the unit test in question
	 * @return
	 */
	public Object otherMethod();

}
