/**
 * Visitor Pattern
 * Lower the value of an element
 * @author gosnat
 *
 */
public class DecreaseVisitor implements Visitor{

	/**
	 * For numbers subtract 1
	 */
	@Override
	public void visit(NumberElement e) {
		e.setNumber(e.getNumber() - 1);
		
	}

	/**
	 * For letters, go back a letter and wrap around
	 */
	@Override
	public void visit(LetterElement e) {
		if(e.getLetter() == 'a') {
			e.setLetter('z');
		}else if(e.getLetter() == 'A') {
			e.setLetter('Z');
		}else {
			e.setLetter((char)(e.getLetter() - 1));
		}	
	}

	@Override
	public void visit(FloatElement e) {
		e.setNumber(e.getNumber() - .1f);
		
	}

}
