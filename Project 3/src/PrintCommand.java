
public class PrintCommand implements Command{
	
	/**
	 * The list object
	 */
	private StringList list;
	
	/**
	 * Holds main system printout
	 */
	private String printOut;

	/**
	 * PrintCommand Execute method
	 */
	@Override
	public String Execute() {
		return list.PrintList() + "\n";
	}

	/**
	 * Constructor for PrintCommand
	 * @param list
	 */
	public PrintCommand(StringList list) {
		this.list = list;
		printOut = "Print List " + list.GetListNumber();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}
}
