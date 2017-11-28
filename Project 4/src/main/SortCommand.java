package main;

/**
 * The Sort Command
 * 
 * @author Jonathan Jarl
 *
 */
public class SortCommand implements Command {

	/**
	 * The list object
	 */
	private StringList list;

	/**
	 * System main printout string
	 */
	private String printOut;

	/**
	 * Sort Execute method
	 */
	@Override
	public String Execute() {
		list.Sort();
		return "List " + list.GetListName() + " is now sorted.\n";
	}

	/**
	 * SortCommand constructor
	 * 
	 * @param list
	 */
	public SortCommand(StringList list) {
		this.list = list;
		printOut = "Sort List " + list.GetListName();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}
}
