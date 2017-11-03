/**
 * A demo class so we can demonstrate JUnit tests
 * Gives information about whether a number is even or odd
 * @author Nathan Gossett
 *
 */
public class EvenOrOdd {
	
	/**
	 * Determines if number is even
	 * @param num number to test
	 * @return true if num is even, false otherwise
	 */
	public static boolean isEven(int num){
		return num % 2 == 0;
	}
	
	
	/**
	 * Determines if number is odd
	 * @param num number to test
	 * @return true if num is odd, false otherwise
	 */
	public static boolean isOdd(int num){
		//intentional error for us to find
		//if(num == 42) return true;
		return num % 2 != 0;
	}

}
