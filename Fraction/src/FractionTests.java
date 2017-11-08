import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import static java.time.Duration.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FractionTests {
	
	private Fraction myFraction;
	
	private Fraction testFraction;
	
	private Fraction FinalFraction;
	
	@Before
	public void SetUp() {
		testFraction = new CandidateFraction(2,3);
	}

	@Test
	public void TestProperFraction() {
		myFraction = new CandidateFraction(1,5);
		assertEquals("Failed to create a numerator", myFraction.getNumerator(), 1);
		assertEquals("Failed to create a denominator", myFraction.getDenominator(), 5);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void TestZeroDenominator() {
		thrown.expect(ArithmeticException.class);
		myFraction = new CandidateFraction(0,0);
	}
	
	@Test
	public void TestNegatives() {
		myFraction = new CandidateFraction(-1,-5);
		assertEquals("Failed to add negative numerator", myFraction.getNumerator(), -1);
		assertEquals("Failed to add negative denominator", myFraction.getDenominator(), -5);
	}
	
	@Test
	public void TestProperAddition() {
		myFraction = new CandidateFraction(1,5);
		FinalFraction = myFraction.add(testFraction);
		assertEquals("Numerator was not calculated correctly", FinalFraction.getNumerator(), 13);
		assertEquals("Denominator was not calculated correctly", FinalFraction.getDenominator(), 15);
	}
	
	@Test
	public void TestProperAdditionReduction() {
		myFraction = new CandidateFraction(1,3);
		FinalFraction = myFraction.add(testFraction);
		assertEquals("Numerator was not calculated correctly", FinalFraction.getNumerator(), 1);
		assertEquals("Denominator was not calculated correctly", FinalFraction.getDenominator(), 1);
	}
	
	@Test
	public void TestAdditionToZero() {
		myFraction = new CandidateFraction(-2, 3);
		assertTimeoutPreemptively(ofMillis(10), ()-> {
			FinalFraction = myFraction.add(testFraction);
			assertEquals("Reduction to Zero was improper", FinalFraction.getNumerator(), 0);
			assertEquals("Reduction to Zero was improper", FinalFraction.getDenominator(), 3);
		});
	}
	
	@Test
	public void TestAdditionOverFlow() {
		myFraction = new CandidateFraction(1, 2147483647);
		thrown.expect(ArithmeticException.class);
		FinalFraction = myFraction.add(testFraction);
	}
	
	@Test
	public void TestAdditionOverFlowNegative() {
		myFraction = new CandidateFraction(-1, 2147483647);
		testFraction = new CandidateFraction(-2, 3);
		thrown.expect(ArithmeticException.class);
		FinalFraction = myFraction.add(testFraction);
	}
}
