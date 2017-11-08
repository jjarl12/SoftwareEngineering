package main;

/**
 * Add a number command
 * 
 * @author Jonathan Jarl
 *
 */
public class AddNumberListCommand implements Command {

	/**
	 * Count of lists instance
	 */
	private ListCounts listCount;

	/**
	 * Invoker instance
	 */
	private Invoker invoker;

	/**
	 * Print out for command
	 */
	private String printOut;

	/**
	 * Constructor for command
	 * 
	 * @param listCount
	 * @param invoker
	 */
	public AddNumberListCommand(ListCounts listCount, Invoker invoker) {
		this.listCount = listCount;
		this.invoker = invoker;
		printOut = "Add Number List";
	}

	/**
	 * Execute method
	 */
	@Override
	public String Execute() {
		NumberList list = new NumberList(listCount.GetNumberOfLists() + 1);
		listCount.SetNumberOfLists();
		Command addNumber = new AddNumberCommand(list);
		Command printList = new PrintCommand(list);
		Command clearList = new ClearCommand(list);
		Command biggestNumber = new BiggestNumberCommand(list);
		Command quit = new QuitCommand();
		invoker.AddCommands(invoker.GetCommands().size() - 1, addNumber);
		invoker.AddCommands(printList);
		invoker.AddCommands(clearList);
		invoker.AddCommands(biggestNumber);
		invoker.AddCommands(quit);
		return "";
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
