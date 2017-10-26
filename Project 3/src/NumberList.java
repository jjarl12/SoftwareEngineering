import java.util.ArrayList;

/**
 * NumberList model
 * @author Jonathan Jarl
 *
 */
public class NumberList implements List{

	private ArrayList<Number> myList;
	
	private int listNumber;
	
	private int itemInList;
	
	public NumberList(int listNumber) {
		myList = new ArrayList<Number>();
		itemInList = 1;
		this.listNumber = listNumber;
	}
	
	public int GetListNumber() {
		return listNumber;
	}
	
	public int GetItemInList() {
		return itemInList;
	}
	
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
	
	public void AddToList(int number) {
		myList.add(number);
		itemInList++;
	}
	
	public void AddToList(double number) {
		myList.add(number);
		itemInList++;
	}
	
	public void ClearList() {
		myList.clear();
		itemInList = 1;
	}
	
	public String GetLargestNumber() {
		if (myList.size() == 0)
			return "There is nothing in the list";
		if (myList.size() == 1)
			return myList.get(0).toString();
		int indexToReturn = 0;
		double numberToReturn = myList.get(0).doubleValue();
		for (int i = 1; i < myList.size(); i++) {
			double numberToCompare = myList.get(i).doubleValue();
			if (numberToCompare > numberToReturn) {
				indexToReturn = i;
				numberToReturn = numberToCompare;
			}
		}
		return myList.get(indexToReturn).toString();
	}
}
