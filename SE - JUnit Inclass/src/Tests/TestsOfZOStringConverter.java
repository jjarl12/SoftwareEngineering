package Tests;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import zoconverter.ZOStringConverter;
/**
 * An abstract parent class for testing classes that implement the ZOStringConverter
 * interface.  This prevents us from having to repeat all the test cases when we want to
 * test a new implementation.  Just inherit from this class and implement the 
 * getConcreteConverter() method to supply the correct type of object you want to test
 * @author gosnat
 *
 */
public abstract class TestsOfZOStringConverter {

	/** A pointer to our concrete converter object to test */
	private ZOStringConverter myConverter;

	/**
	 * Factory Method so child classes can determine which implementation to test
	 * @return A concrete ZOStringConverter object to run through these tests
	 */

	protected abstract ZOStringConverter getConcreteConverter();

	/**
	 * We use this instead of a constructor to set things up so that
	 * if something goes wrong during initialization we get a better 
	 * stack trace and error message
	 * @throws Exception if anything goes wrong
	 */
	@Before
	public void setUp() throws Exception {
		myConverter = getConcreteConverter();
	}

	@Test
	public void testZero() {
		assertEquals("Z string failed", myConverter.convertStringToLong("Z"), 0L);
	}
	
	@Test public void testOne() {
		assertEquals("O string failed", myConverter.convertStringToLong("O"), 1L);
	}

	@Test
	public void test42() {
		assertEquals("42 failed", myConverter.convertStringToLong("OZOZOZ"), 42L);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test 
	public void testNullString() {
		thrown.expect(NullPointerException.class);
		myConverter.convertStringToLong(null);
	}
	
	@Test
	public void testHello() {
		thrown.expect(IllegalArgumentException.class);
		myConverter.convertStringToLong("Hello");
	}
	
	@Test
	public void testLongerThan60() {
		thrown.expect(IllegalArgumentException.class);
		myConverter.convertStringToLong("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
	}
}
