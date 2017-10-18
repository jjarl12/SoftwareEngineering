/**
 * Visitor Pattern
 * Element that can be visited
 * @author gosnat
 *
 */
public interface Element {

	/**
	 * Double dispatch to get the types correct
	 * @param v
	 */
	public void accept(Visitor v);
}
