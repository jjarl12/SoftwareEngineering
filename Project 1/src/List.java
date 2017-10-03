import java.util.ArrayList;
import java.util.Collections;

public class List {
	
	private ArrayList<String> myList;
	
	public List() {
		myList = new ArrayList<String>();
	}
	
	public String PrintList() {
		return myList.toString();
	}
	
	public void Sort() {
		Collections.sort(myList);
	}
	
	public void AddToList(String item) {
		myList.add(item);
	}
	
	public void ClearList() {
		myList.clear();
	}
}
