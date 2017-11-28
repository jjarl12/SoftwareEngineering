package main;
import java.util.ArrayList;
import java.util.Observable;

/**
 * NumberList model
 * 
 * @author Jonathan Jarl
 *
 */
public class NumberList extends List{

	/**
	 * The actual list
	 */
	private ArrayList<Number> myList;

	/**
	 * The number of the list
	 */
	private String listName;

	/**
	 * The number of items in the list
	 */
	private int itemInList;

	/**
	 * List constructor
	 * 
	 * @param listNumber
	 */
	public NumberList(String listName) {
		myList = new ArrayList<Number>();
		itemInList = 1;
		this.listName = listName;
		setChanged();
		notifyObservers();
	}

	/**
	 * Getter for listNumber
	 */
	public String GetListName() {
		return listName;
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
		String returnString = "";
		for (int i = 0; i < myList.size(); i++) {
			returnString += myList.get(i);
			if (i + 1 != myList.size())
				returnString += "\n";
		}
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
		setChanged();
		notifyObservers();
	}

	/**
	 * Add a double to the list
	 * 
	 * @param number
	 */
	public void AddToList(double number) {
		myList.add(number);
		itemInList++;
		setChanged();
		notifyObservers();
	}

	/**
	 * Clear the list
	 */
	public void ClearList() {
		myList.clear();
		itemInList = 1;
		setChanged();
		notifyObservers();
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
