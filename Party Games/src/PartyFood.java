/**
 * Food that can be served at a party
 * @author gosnat
 *
 */
public interface PartyFood {
	/** In a real example, this would be some complicated service
	 * For this example, just print out what food you're serving
	 */
	public void serveFood();
	
	/**
	 * In a real example, this would check to see if any food is left
	 * @return True if you still have food (make it return false eventually)
	 */
	public boolean isFoodRemaining();

}
