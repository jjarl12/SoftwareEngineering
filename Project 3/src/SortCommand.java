
public class SortCommand implements Command{
	
	/**
	 * The list object
	 */
	private List list;
	
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
		return "List " + list.GetListNumber() + " is now sorted.\n";
	}

	/**
	 * SortCommand constructor
	 * @param list
	 */
	public SortCommand(List list) {
		this.list = list;
		printOut = "Sort List " + list.GetListNumber();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}
}
