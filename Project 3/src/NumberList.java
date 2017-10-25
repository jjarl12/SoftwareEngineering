import java.util.ArrayList;

/**
 * NumberList model
 * @author Jonathan Jarl
 *
 */
public class NumberList implements List{

	private ArrayList<Double> myList;
	
	private ArrayList<Boolean> typeList;
	
	private int listNumber;
	
	private int itemInList;
	
	public NumberList(int listNumber) {
		myList = new ArrayList<Double>();
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
			double number = myList.get(i);
			if (typeList.get(i) == true) 
				returnString += (int) number;
			else
				returnString += number;
			if (i + 1 != myList.size())
				returnString += ", ";
		}
		returnString += "}";
		return returnString;
	}
	
	public void AddToList(int number) {
		myList.add((double) number);
		typeList.add(true);
	}
	
	public void AddToList(double number) {
		myList.add(number);
		typeList.add(false);
	}
	
	public void ClearList() {
		myList.clear();
		typeList.clear();
		itemInList = 1;
	}
	
	public Number GetLargestNumber() {
		if (myList.size() == 0)
			return -0;
		int indexToReturn = 0;
		for (int i = 1; i < myList.size(); i++) {
			if (myList.get(i) > myList.get(indexToReturn))
				indexToReturn = i;
		}
		double numberToReturn = myList.get(indexToReturn);
		if (typeList.get(indexToReturn) == true)
			return (int) numberToReturn;
		return numberToReturn;
	}
}
