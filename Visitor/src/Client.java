import java.util.ArrayList;
/**
 * Visitor pattern driver
 * @author gosnat
 *
 */
public class Client {
	public static void main(String [] args) {
		ArrayList<Element> myDataStructure = new ArrayList<Element>();
		myDataStructure.add(new NumberElement(6));
		myDataStructure.add(new LetterElement('z'));
		myDataStructure.add(new LetterElement('t'));
		myDataStructure.add(new NumberElement(-52));
		myDataStructure.add(new LetterElement('b'));
		myDataStructure.add(new LetterElement('h'));
		myDataStructure.add(new NumberElement(17));
		
		IncreaseVisitor iv = new IncreaseVisitor();
		DecreaseVisitor dv = new DecreaseVisitor();
		
		System.out.println("Start:\n" + myDataStructure);
		
		System.out.println("Visiting with increase");
		for(Element e : myDataStructure) {
			e.accept(iv);
		}
		System.out.println(myDataStructure);
		
		System.out.println("Visiting with increase");
		for(Element e : myDataStructure) {
			e.accept(iv);
		}
		System.out.println(myDataStructure);
		
		System.out.println("Visiting with decrease");
		for(Element e : myDataStructure) {
			e.accept(dv);
		}
		System.out.println(myDataStructure);
	}

}
