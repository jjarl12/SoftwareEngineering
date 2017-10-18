/**
 * Visitor Pattern example
 * Increase the value of an element
 * @author gosnat
 *
 */
public class IncreaseVisitor implements Visitor{

	/**
	 * For numbers, add one
	 */
	@Override
	public void visit(NumberElement e) {
		e.setNumber(e.getNumber() + 1);
		
	}

	/**
	 * For letters, move up one letter and wrap around if needed
	 */
	@Override
	public void visit(LetterElement e) {
		if(e.getLetter() == 'z') {
			e.setLetter('a');
		}else if(e.getLetter() == 'Z') {
			e.setLetter('A');
		}else {
			e.setLetter((char)(e.getLetter() + 1));
		}	
	}
	
	public void visit(FloatElement e) {
		e.setNumber(e.getNumber() + .1f);
	}
}
