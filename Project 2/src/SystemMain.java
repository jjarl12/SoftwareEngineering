import java.util.ArrayList;
import java.util.Scanner;
/**
 * Project 1
 * @author Jonathan Jarl
 * 1203
 *
 */
public class SystemMain {
	
	/**
	 * List of all the created lists
	 */
	private ArrayList<List> listOfLists;
	
	/**
	 * Number of total lists
	 */
	private int listCount;
	
	/**
	 * Constructor for System Main
	 * @param newListCount
	 */
	public SystemMain(int newListCount) {
		listOfLists = new ArrayList<List>();
		listCount = newListCount;
		for (int i = 0; i < listCount; i++) {
			listOfLists.add(new List());
		}
		
		Command print = new Command() {
			public void Execute() {
				listOfLists.get(0).PrintList();
			}
		};
		Main();
	}
	
	/**
	 * Main loop method
	 */
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
			
			System.out.println();
			
			if (option <= addMax)
				AddToList(option - 1);
			else if (option <= printMax)
				PrintList(option - listCount - 1);
			else if (option <= sortMax)
				SortList (option - listCount * 2 - 1);
			else if (option <= clearMax)
				ClearList(option - listCount * 3 - 1);
			else if (option > quit || option < 1)
				System.out.println("Please select a valid option\n");
		}
	}
	
	/**
	 * Add items to list
	 * @param list
	 */
	public void AddToList(int list) {
		System.out.println("Enter words into List " + (list+1) + " one at a time");
		System.out.println("Enter the number 0 to stop\n");
		String word = "";
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (!word.equals("0")) {
			System.out.print("Enter word " + i + ": ");
			word = input.nextLine();
			if (!word.equals("0"))
			{
				listOfLists.get(list).AddToList(word);
				i++;
			}
		}
		System.out.println();
	}
	
	/**
	 * Print a list
	 * @param list
	 */
	public void PrintList(int list) {
		System.out.println("List " + (list+1) + " is " + listOfLists.get(list).PrintList());
		System.out.println("\n");
	}
	
	/**
	 * Sort a list
	 * @param list
	 */
	public void SortList(int list) {
		listOfLists.get(list).Sort();
		System.out.println("List " + (list+1) + " is now sorted.\n");
	}
	
	/**
	 * Clear a list
	 * @param list
	 */
	public void ClearList(int list) {
		listOfLists.get(list).ClearList();
		System.out.println("List " + (list+1) + " is now empty.\n");
	}
}
