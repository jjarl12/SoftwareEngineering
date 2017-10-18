/**
 * Visitor Pattern Example
 * An element that stores a number
 * @author gosnat
 *
 */
public class NumberElement implements Element{
	/** Our number data */
	private int number;
	
	/**
	 * Constructor
	 * @param n starting value
	 */
	public NumberElement(int n) {
		number = n;
	}
	
	/**
	 * @return stored number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * 
	 * @param n new value to set
	 */
	public void setNumber(int n) {
		number = n;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	@Override
	public String toString() {
		return "" + number;
	}

}
