package main;

/**
 * The Print Command
 * @author Jonathan Jarl
 *
 */
public class PrintCommand implements Command {

	/**
	 * The list object
	 */
	private List list;

	/**
	 * Holds main system printout
	 */
	private String printOut;

	/**
	 * PrintCommand Execute method
	 */
	@Override
	public String Execute() {
		return list.PrintList();
	}

	/**
	 * Constructor for PrintCommand
	 * 
	 * @param list
	 */
	public PrintCommand(List list) {
		this.list = list;
		printOut = "Print List " + list.GetListName();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}
}
