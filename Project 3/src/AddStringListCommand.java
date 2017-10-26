
public class AddStringListCommand implements Command {
	
	private ListCounts listCount;
	
	private Invoker invoker;
	
	private String printOut;
	
	public AddStringListCommand(ListCounts listCount, Invoker invoker) {
		this.listCount = listCount;
		this.invoker = invoker;
		printOut = "Add String List";
	}

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

	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
