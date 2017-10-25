import java.util.Scanner;

public class AddCommand implements Command {
	
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
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (!word.equals("0")) {
			System.out.print("Enter word " + list.GetWordInList() + ": ");
			word = input.nextLine();
			if (!word.equals("0"))
			{
				list.AddToList(word);
				i++;
			}
		}
		return "";
	}
	
	/**
	 * AddCommand constructor
	 * @param list
	 */
	public AddCommand(StringList list) {
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
