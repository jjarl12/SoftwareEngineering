import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import static java.time.Duration.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ExpectedException;

/**
 * HW 28
 * @author Jonathan Jarl and Garrett Johnson
 *
 */
public class FractionTests {
	
	/**
	 * Instances of a Fraction object
	 */
	private Fraction myFraction;
	
	private Fraction testFraction;
	
	private Fraction FinalFraction;
	
	/**
	 * The setup for each test
	 */
	@Before
	public void SetUp() {
		testFraction = new CandidateFraction(2,3);
	}

	/**
	 * Tests creating a proper fraction
	 */
	@Test
	public void TestProperFraction() {
		myFraction = new CandidateFraction(1,5);
		assertEquals("Failed to create a numerator", myFraction.getNumerator(), 1);
		assertEquals("Failed to create a denominator", myFraction.getDenominator(), 5);
	}
	
	/**
	 * Tests creating an improper fraction
	 */
	@Test
	public void TestImproperFraction() {
		myFraction = new CandidateFraction(7,5);
		assertEquals("Failed to create a numerator", myFraction.getNumerator(), 7);
		assertEquals("Failed to create a denominator", myFraction.getDenominator(), 5);
	}
	
	/**
	 * An exception rule
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	 * Tests a zero denominator
	 */
	@Test
	public void TestZeroDenominator() {
		thrown.expect(ArithmeticException.class);
		myFraction = new CandidateFraction(0,0);
	}
	
	/**
	 * Tests a negative proper fraction
	 */
	@Test
	public void TestNegatives() {
		myFraction = new CandidateFraction(-1,-5);
		assertEquals("Failed to add negative numerator", myFraction.getNumerator(), -1);
		assertEquals("Failed to add negative denominator", myFraction.getDenominator(), 5);
	}
	
	@Test
	public void TestNegativeDenominator() {
		myFraction = new CandidateFraction(1,-5);
		assertEquals("Failed to add negative numerator", myFraction.getNumerator(), -1);
		assertEquals("Failed to add negative denominator", myFraction.getDenominator(), 5);
	}
	
	@Test
	public void TestFractionReduction() {
		myFraction = new CandidateFraction(2,4);
		assertEquals("Failed to reduce numerator", myFraction.getNumerator(), 1);
		assertEquals("Failed to reduce denominator", myFraction.getDenominator(), 2);
	}
	
	@Test
	public void TestZeroNumeratorFraction() {
		assertTimeoutPreemptively(ofMillis(10), ()-> {
			myFraction = new CandidateFraction(0, 5);
			assertEquals("Failed to retain 0", myFraction.getNumerator(), 0);
			assertEquals("Failed to reduce to 1 with 0 numerator", myFraction.getDenominator(), 1);
		});
	}
	
	@Test
	public void TestNegativeReductionFraction() {
		assertTimeoutPreemptively(ofMillis(10), ()-> {
			myFraction = new CandidateFraction(2, -10);
			assertEquals("Failed to reduce numerator to -1", myFraction.getNumerator(), -1);
			assertEquals("Failed to reduce denominator to 5", myFraction.getDenominator(), 5);
		});
	}
	
	/**
	 * Tests a proper fraction
	 */
	@Test
	public void TestProperAddition() {
		myFraction = new CandidateFraction(1,5);
		FinalFraction = myFraction.add(testFraction);
		assertEquals("Numerator was not calculated correctly", FinalFraction.getNumerator(), 13);
		assertEquals("Denominator was not calculated correctly", FinalFraction.getDenominator(), 15);
	}
	
	/**
	 * Test a proper fraction with reduction
	 */
	@Test
	public void TestProperAdditionReduction() {
		myFraction = new CandidateFraction(1,3);
		FinalFraction = myFraction.add(testFraction);
		assertEquals("Numerator was not calculated correctly", FinalFraction.getNumerator(), 1);
		assertEquals("Denominator was not calculated correctly", FinalFraction.getDenominator(), 1);
	}
	
	/**
	 * Test an add to zero
	 */
	@Test
	public void TestAdditionToZero() {
		myFraction = new CandidateFraction(-2, 3);
		assertTimeoutPreemptively(ofMillis(100), ()-> {
			FinalFraction = myFraction.add(testFraction);
			assertEquals("Reduction to Zero was improper", FinalFraction.getNumerator(), 0);
			assertEquals("Reduction to Zero was improper", FinalFraction.getDenominator(), 1);
		});
	}
	
	/**
	 * Tests a positive overflow
	 */
	@Test
	public void TestAdditionOverFlowDenominator() {
		myFraction = new CandidateFraction(1, 2147483647);
		thrown.expect(ArithmeticException.class);
		FinalFraction = myFraction.add(testFraction);
	}
	
	/**
	 * Tests a negative overflow
	 */
	@Test
	public void TestAdditionOverFlowNegative() {
		myFraction = new CandidateFraction(-1, 2147483647);
		testFraction = new CandidateFraction(-2, 3);
		thrown.expect(ArithmeticException.class);
		FinalFraction = myFraction.add(testFraction);
	}
	
	/**
	 * Test a negative numerator overflow
	 */
	@Test
	public void TestAdditonOverFlowNegative2() {
		myFraction = new CandidateFraction(-2147483647, 7);
		testFraction = new CandidateFraction(-3, 13);
		thrown.expect(ArithmeticException.class);
		FinalFraction = myFraction.add(testFraction);
	}
	
	/**
	 * Test a numerator overflow
	 */
	@Test
	public void TestAdditionOverFlowNumerator() {
		myFraction = new CandidateFraction(2147483647, 2);
		testFraction = new CandidateFraction(1, 2);
		thrown.expect(ArithmeticException.class);
		FinalFraction = myFraction.add(testFraction);
	}
}
