/**
 * Visitor interface
 * @author gosnat
 *
 */
public interface Visitor {
	/**
	 * Visit a NumberElement
	 * @param e the element to visit
	 */
	public void visit(NumberElement e);
	
	/**
	 * Visit a LetterElement
	 * @param e the element to visit
	 */
	public void visit(LetterElement e);
	
	public void visit(FloatElement e);
}
