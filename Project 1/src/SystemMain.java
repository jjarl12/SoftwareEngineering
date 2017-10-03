import java.util.ArrayList;

public class SystemMain {
	
	private ArrayList<List> listOfLists;
	
	private int listCount;

	public static void main(String[] args) {
		new SystemMain(2);
	}
	
	public SystemMain(int newListCount) {
		listOfLists = new ArrayList<List>();
		listCount = newListCount;
		for (int i = 0; i < listCount; i++) {
			listOfLists.add(new List());
		}
	}
}
