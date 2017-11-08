package main;

/**
 * Add a string list command
 * 
 * @author Jonathan Jarl
 *
 */
public class AddStringListCommand implements Command {

	/**
	 * Count of lists instance
	 */
	private ListCounts listCount;

	/**
	 * Invoker instance
	 */
	private Invoker invoker;

	/**
	 * Command print out
	 */
	private String printOut;

	/**
	 * Constructor for command
	 * 
	 * @param listCount
	 * @param invoker
	 */
	public AddStringListCommand(ListCounts listCount, Invoker invoker) {
		this.listCount = listCount;
		this.invoker = invoker;
		printOut = "Add String List";
	}

	/**
	 * Execute method
	 */
	@Override
	public String Execute() {
		StringList list = new StringList(listCount.GetNumberOfLists() + 1);
		listCount.SetNumberOfLists();
		Command addWord = new AddWordCommand(list);
		Command printList = new PrintCommand(list);
		Command clearList = new ClearCommand(list);
		Command sortList = new SortCommand(list);
		Command quit = new QuitCommand();
		invoker.AddCommands(invoker.GetCommands().size() - 1, addWord);
		invoker.AddCommands(printList);
		invoker.AddCommands(clearList);
		invoker.AddCommands(sortList);
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
