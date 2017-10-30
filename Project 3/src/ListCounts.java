
/**
 * List count class
 * @author Jonathan Jarl
 *
 */
public class ListCounts {

	/**
	 * Stores the number of lists
	 */
	private int numberOfLists;
	
	/**
	 * Constructor of ListCounts
	 */
	public ListCounts() {
		numberOfLists = 0;
	}
	
	/**
	 * Getter for numberOfLists
	 * @return
	 */
	public int GetNumberOfLists() {
		return numberOfLists;
	}
	
	/**
	 * Setter for numberOfLists
	 */
	public void SetNumberOfLists() {
		numberOfLists++;
	}
}
