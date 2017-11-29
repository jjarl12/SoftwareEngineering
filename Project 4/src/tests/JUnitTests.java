package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.NumberList;

/**
 * Main Testing class
 * @author Jonathan Jarl
 *
 */
public class JUnitTests {
	
	/**
	 * Instance of a number List
	 */
	private NumberList myList;

	/**
	 * Setup of tests
	 * @throws Exception
	 */
	@Before
	public void Setup() throws Exception {
		myList = new NumberList("Test");
	}
	
	/**
	 * Testing of adding an int
	 */
	@Test
	public void testAddInt() {
		myList.AddToList(5);
		assertEquals("5 failed to be added to list", myList.PrintList(), "5");
	}
	
	/**
	 * Testing of adding a double
	 */
	@Test
	public void testAddDouble() {
		myList.AddToList(5.435);
		assertEquals("5.435 failed to be added to list", myList.PrintList(), "5.435");
	}
	
	/**
	 * Testing of adding zeros
	 */
	@Test
	public void testAddZero() {
		myList.AddToList(0);
		myList.AddToList(0.0);
		assertEquals("0 failed to be added to list", myList.PrintList(), "0\n0.0");
	}
	
	/**
	 * Testing of adding a negative
	 */
	@Test
	public void testAddNegative() {
		myList.AddToList(-5);
		assertEquals("-5 failed to be added to list", myList.PrintList(), "-5");
	}
	
	/**
	 * Testing of having an int be the biggest
	 */
	@Test
	public void testBiggestNumberIntWin() {
		myList.AddToList(5);
		myList.AddToList(3.1);
		assertEquals("5 was not returned as biggest", myList.GetLargestNumber(), 5);
	}
	
	/**
	 * Testing of having a double be the biggest
	 */
	@Test
	public void testBiggestNumberDoubleWin() {
		myList.AddToList(3);
		myList.AddToList(3.1);
		assertEquals("3.1 was not returned as biggest", myList.GetLargestNumber(), 3.1);
	}
	
	/**
	 * Testing of havibng an empty list
	 */
	@Test
	public void testBiggestNumberEmptyList() {
		assertEquals("The correct fail string was not returned", myList.GetLargestNumber(), null);
	}
	
	/**
	 * Testing of having a single entry
	 */
	@Test
	public void testBiggestNumberSingleEntry() {
		myList.AddToList(5);
		assertEquals("5 was not returned as biggest", myList.GetLargestNumber(), 5);
	}
	
	/**
	 * Testing of having a positive number be the biggest
	 */
	@Test
	public void testBiggestNumberPositiveWin() {
		myList.AddToList(5);
		myList.AddToList(-7);
		assertEquals("5 was not returned as biggest", myList.GetLargestNumber(), 5);
	}
	
	/**
	 * Testing of having a negative number be the biggest
	 */
	@Test
	public void testBiggestNumberNegativeWin() {
		myList.AddToList(-5);
		myList.AddToList(-7);
		assertEquals("-5 was not returned as biggest", myList.GetLargestNumber(), -5);
	}
}
