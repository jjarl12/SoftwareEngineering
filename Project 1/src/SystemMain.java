import java.util.ArrayList;
import java.util.Scanner;

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
		Main();
	}
	
	public void Main() {
		int option = 0;
		int addMax = listCount;
		int printMax = listCount * 2;
		int sortMax = listCount * 3;
		int clearMax = listCount * 4;
		int quit = listCount * 4 + 1;
		Scanner input = new Scanner(System.in);
		while (option != quit) {
			System.out.println("String List Menu");
			for (int i = 1; i <= listCount; i++) {
				System.out.println(i + ": Enter words into List " + i);
			}
			for (int i = listCount + 1; i <= printMax; i++) {
				System.out.println(i + ": Print List " + (i - listCount));
			}
			for (int i = listCount * 2 + 1; i <= sortMax; i++) {
				System.out.println(i + ": Sort List " + (i - listCount * 2));
			}
			for (int i = listCount * 3 + 1; i <= clearMax; i++) {
				System.out.println(i + ": Clear List " + (i-listCount * 3));
			}
			System.out.println(quit + ": Quit");
			System.out.println("Please pick an option:");
			option = input.nextInt();
			
			if (option <= addMax)
				AddToList(option);
			else if (option <= printMax)
				PrintList(option - listCount);
			else if (option <= sortMax)
				SortList (option - listCount * 2);
			else if (option <= clearMax)
				ClearList(option - listCount * 3);
			else if (option > quit || option < 1)
				System.out.println("Please select a valid option");
		}
	}
	
	public void AddToList(int list) {
		System.out.println("Enter words into List " + list + " one at a time");
		System.out.println("Enter the number 0 to stop");
		String word = "";
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (word != "0") {
			System.out.print("Enter word " + i + ": ");
			word = input.nextLine();
			if (word != "0")
			{
				listOfLists.get(list).AddToList(word);
				i++;
			}
		}
	}
	
	public void PrintList(int list) {
		System.out.println("List " + list + " is " + listOfLists.get(list).PrintList());
		System.out.println("\n");
	}
	
	public void SortList(int list) {
		
	}
	
	public void ClearList(int list) {
		
	}
}
