
/**
 * Biggest Number Command
 * @author Jonathan Jarl
 *
 */
public class BiggestNumberCommand implements Command {
	
	/**
	 * Instance of list
	 */
	private NumberList list;
	
	/**
	 * Print out for command
	 */
	private String printOut;
	
	/**
	 * constructor for command
	 * @param list
	 */
	public BiggestNumberCommand(NumberList list) {
		this.list = list;
		printOut = "Return biggest number in List " + list.GetListNumber();
	}

	/**
	 * Execute method
	 */
	@Override
	public String Execute() {
		return list.GetLargestNumber();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
