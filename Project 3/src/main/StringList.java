package main;
import java.util.ArrayList;
import java.util.Collections;

/**
 * StringList model
 * 
 * @author Jonathan Jarl
 *
 */
public class StringList implements List {

	/**
	 * string list
	 */
	private ArrayList<String> myList;

	/**
	 * Stores the number of the list
	 */
	private int listNumber;

	/**
	 * Stores the number of words in the list
	 */
	private int itemInList;

	/**
	 * list constructor
	 */
	public StringList(int listNumber) {
		myList = new ArrayList<String>();
		itemInList = 1;
		this.listNumber = listNumber;
	}

	/**
	 * Getter for listNumber
	 * 
	 * @return
	 */
	public int GetListNumber() {
		return listNumber;
	}

	/**
	 * Getter for wordInList
	 * 
	 * @return
	 */
	public int GetItemInList() {
		return itemInList;
	}

	/**
	 * Print method
	 * 
	 * @return
	 */
	public String PrintList() {
		String returnString = "List " + listNumber + " is {";
		for (int i = 0; i < myList.size(); i++) {
			returnString += myList.get(i);
			if (i + 1 != myList.size())
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
	 * 
	 * @param item
	 */
	public void AddToList(String item) {
		myList.add(item);
		itemInList++;
	}

	/**
	 * Clear list method
	 */
	public void ClearList() {
		myList.clear();
		itemInList = 1;
	}
}
