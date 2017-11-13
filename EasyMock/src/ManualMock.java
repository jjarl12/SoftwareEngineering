/**
 * Manually creating a mock object
 * Note that it satisfies the interface in question, but 
 * it's just returning dummy values as needed to drive a unit test
 * of the ClassToTest class
 * @author gosnat
 *
 */
public class ManualMock implements DependencyInterface{
	/** Remember what value this particular mock object should return */
	private int mockValue;
	
	/**
	 * Constructor that will take in value specific to a unit test of ClassToTest
	 * @param mv The value that we want getValue() to return when called as
	 	part of the unit test of ClassToTest
	 */
	public ManualMock(int mv) {
		mockValue = mv;
	}
	
	@Override
	public int getValue() {
		return mockValue;
	}

	//Note that even though this test doesn't use this method, 
	//if we're manually creating a mock object we still have to
	//implement all of the methods in the interface
	@Override
	public Object otherMethod() {
		return null;
	}

	
}
