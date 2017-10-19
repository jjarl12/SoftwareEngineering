import java.util.ArrayList;

/**
 * NumberList model
 * @author Jonathan
 *
 */
public class NumberList {

	private ArrayList<Number> myList;
	
	private int listNumber;
	
	private int numberInList;
	
	public NumberList(int listNumber) {
		myList = new ArrayList<Number>();
		numberInList = 1;
		this.listNumber = listNumber;
	}
	
	public int GetListNumber() {
		return listNumber;
	}
	
	public int GetNumberInList() {
		return numberInList;
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
	}
	
	public void AddToList(double number) {
		myList.add(number);
	}
	
	public void ClearList() {
		myList.clear();
		numberInList = 1;
	}
	
	public Number GetLargestNumber() {
		if (myList.size() == 0)
			return -0;
		Number numberToReturn = myList.get(0);
		for (int i = 1; i < myList.size(); i++) {
			if (myList.get(i) > numberToReturn)
				numberToReturn = myList.get(i);
		}
	}
}
