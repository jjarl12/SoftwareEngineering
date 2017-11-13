import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.easymock.EasyMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Example of using Mock Objects to unit test a class without having to
 * connect it to other "real" objects.  Unit tests should test a specific
 * class in isolation, so we don't want to involve real objects yet.
 * 
 * Integration tests would involve real objects rather than mocks
 * @author gosnat
 *
 */
class TestsUsingMocks {


	@Test
	void testPositiveWithManualMock() {
		//manually create a mock object that will return the value 42 when 
		//mock.getValue() is called during the unit test
		//Note that mock.getValue() is called as part of ClassToTest.isDependencyNegative()
		ManualMock mock = new ManualMock(42);
		ClassToTest testObj = new ClassToTest(mock);
		assertFalse(testObj.isDependencyNegative());
	}
	
	/**
	 * An example of creating a mock object with EasyMock
	 */
	@Test
	void testPositiveWithEasyMock() {
		//create a mock object
		DependencyInterface mock = EasyMock.createMock(DependencyInterface.class);
		//Explain what the mock should do for any relevant methods
		EasyMock.expect(mock.getValue()).andReturn(42);
		//Note that we don't bother specifying what to do for methods that aren't
		//part of this unit test
		
		//and once you're done setting up all appropriate responses for this test
		EasyMock.replay(mock);
		
		ClassToTest testObj = new ClassToTest(mock);
		assertFalse(testObj.isDependencyNegative());
	
	}
	
	
	

}
