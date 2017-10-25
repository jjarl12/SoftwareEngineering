import java.util.Scanner;

public class AddWordCommand implements Command {
	
	/**
	 * The list object
	 */
	private StringList list;
	
	/**
	 * Holds main system print out
	 */
	private String printOut;

	/**
	 * AddCommand execute method
	 */
	@Override
	public String Execute() {
		System.out.println("\nEnter words into List " + (list.GetListNumber()) + " one at a time");
		System.out.println("Enter the number 0 to stop\n");
		String word = "";
		Scanner input = new Scanner(System.in);
		while (!word.equals("0")) {
			System.out.print("Enter word " + list.GetItemInList() + ": ");
			word = input.nextLine();
			if (!word.equals("0"))
			{
				list.AddToList(word);
			}
		}
		return "";
	}
	
	/**
	 * AddCommand constructor
	 * @param list
	 */
	public AddWordCommand(StringList list) {
		this.list = list;
		printOut = "Enter words into List " + list.GetListNumber();
	}
	
	/**
	 * Getter for printout
	 */
	public String GetPrintOut() {
		return printOut;
	}
}
