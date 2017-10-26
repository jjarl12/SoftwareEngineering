
public class AddNumberListCommand implements Command {
	
	private ListCounts listCount;
	
	private Invoker invoker;
	
	private String printOut;
	
	public AddNumberListCommand(ListCounts listCount, Invoker invoker) {
		this.listCount = listCount;
		this.invoker = invoker;
		printOut = "Add Number List";
	}

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

	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
