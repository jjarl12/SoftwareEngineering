package main;

/**
 * Clear Command
 * 
 * @author Jonathan Jarl
 *
 */
public class ClearCommand implements Command {

	/**
	 * The list object
	 */
	private List list;

	/**
	 * The command main print string
	 */
	private String printOut;

	/**
	 * Clear Execute method
	 */
	@Override
	public String Execute() {
		list.ClearList();
		return "List " + list.GetListNumber() + " is now empty\n";
	}

	/**
	 * ClearCommand constructor
	 * 
	 * @param list
	 */
	public ClearCommand(List list) {
		this.list = list;
		printOut = "Clear List " + list.GetListNumber();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}
}
