package main;
import java.util.ArrayList;

/**
 * NumberList model
 * 
 * @author Jonathan Jarl
 *
 */
public class NumberList implements List {

	/**
	 * The actual list
	 */
	private ArrayList<Number> myList;

	/**
	 * The number of the list
	 */
	private int listNumber;

	/**
	 * The number of items in the list
	 */
	private int itemInList;

	/**
	 * List constructor
	 * 
	 * @param listNumber
	 */
	public NumberList(int listNumber) {
		myList = new ArrayList<Number>();
		itemInList = 1;
		this.listNumber = listNumber;
	}

	/**
	 * Getter for listNumber
	 */
	public int GetListNumber() {
		return listNumber;
	}

	/**
	 * Getter for itemInList
	 */
	public int GetItemInList() {
		return itemInList;
	}

	/**
	 * PrintList method
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
	 * Add an int to the list
	 * 
	 * @param number
	 */
	public void AddToList(int number) {
		myList.add(number);
		itemInList++;
	}

	/**
	 * Add a double to the list
	 * 
	 * @param number
	 */
	public void AddToList(double number) {
		myList.add(number);
		itemInList++;
	}

	/**
	 * Clear the list
	 */
	public void ClearList() {
		myList.clear();
		itemInList = 1;
	}

	/**
	 * Get the largest number of the list
	 * 
	 * @return
	 */
	public Number GetLargestNumber() {
		if (myList.size() == 0)
			return null;
		if (myList.size() == 1)
			return myList.get(0);
		int indexToReturn = 0;
		double numberToReturn = myList.get(0).doubleValue();
		for (int i = 1; i < myList.size(); i++) {
			double numberToCompare = myList.get(i).doubleValue();
			if (numberToCompare > numberToReturn) {
				indexToReturn = i;
				numberToReturn = numberToCompare;
			}
		}
		return myList.get(indexToReturn);
	}
}
