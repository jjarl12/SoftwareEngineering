/**
 * Visitor Pattern example
 * An element that stores a letter
 * @author gosnat
 *
 */
public class LetterElement implements Element{
	/** Our letter data */
	private char letter;
	
	/**
	 * Constructor
	 * @param c starting value
	 */
	public LetterElement(char c) {
		//TODO should really check to make sure this is a letter
		letter = c;
	}
	
	/**
	 * 
	 * @return stored letter
	 */
	public char getLetter() {
		return letter;
	}
	
	/**
	 * 
	 * @param c new letter value
	 */
	public void setLetter(char c) {
		letter = c;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	@Override
	public String toString() {
		return "" + letter;
	}

}
