import java.util.ArrayList;
import java.util.Collections;

/**
 * List model
 * @author Jonathan Jarl
 *
 */
public class List {
	
	/**
	 * string list
	 */
	private ArrayList<String> myList;
	
	/**
	 * list constructor
	 */
	public List() {
		myList = new ArrayList<String>();
	}
	
	/**
	 * Print method
	 * @return
	 */
	public String PrintList() {
		return myList.toString();
	}
	
	/**
	 * Sort Method
	 */
	public void Sort() {
		Collections.sort(myList);
	}
	
	/**
	 * Add item method
	 * @param item
	 */
	public void AddToList(String item) {
		myList.add(item);
	}
	
	/**
	 * Clear list method
	 */
	public void ClearList() {
		myList.clear();
	}
}
