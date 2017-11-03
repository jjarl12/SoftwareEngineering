package Tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * An example of a test suite that will run the tests contained in the listed test classes
 * @author gosnat
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ TestsOfZOConverterA.class, TestsOfZOConverterB.class, TestsOfZOConverterC.class,
		TestsOfZOConverterD.class })
public class AllTests {

}
