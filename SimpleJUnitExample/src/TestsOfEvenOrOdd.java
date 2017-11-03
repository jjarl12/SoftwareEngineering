import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A very simple JUnit test example
 * Methods with @Test in front of them will be treated as a test case
 * when this is run
 * @author gosnat
 *
 */
public class TestsOfEvenOrOdd {

	/** Test the isEven() method */
	@Test
	public void testIsEven() {
		for(int i = -1000; i < 1000; i += 2){
			assertTrue(EvenOrOdd.isEven(i));
			assertFalse(EvenOrOdd.isEven(i+1));
		}
	}
	
	/** Test the isOdd method */
	@Test
	public void testIsOdd(){
		for(int i = -1000; i < 1000; i += 2){
			assertFalse("Failure input was: " + i, EvenOrOdd.isOdd(i));
			assertTrue(EvenOrOdd.isOdd(i+1));
		}
	}

}
