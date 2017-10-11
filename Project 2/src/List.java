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
	
	private int listNumber;
	
	/**
	 * list constructor
	 */
	public List(int listNumber) {
		myList = new ArrayList<String>();
		this.listNumber = listNumber;
	}
	
	public int GetListNumber() {
		return listNumber;
	}
	
	/**
	 * Print method
	 * @return
	 */
	public String PrintList() {
		String returnString = "List " + listNumber + " is {";
		for (int i = 0; i < myList.size(); i++) {
			returnString += myList.get(i);
			if(i + 1 != myList.size())
				returnString += ", ";
		}
		returnString += "}";
		return returnString;
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
