package main;

import java.util.ArrayList;

/**
 * Add a string list command
 * 
 * @author Jonathan Jarl
 *
 */
public class AddStringListCommand implements Command {

	/**
	 * Command print out
	 */
	private String printOut;
	
	/**
	 * Instance of Gui client
	 */
	private GUIClient mainGui;

	/**
	 * Constructor for command
	 * 
	 * @param listCount
	 * @param invoker
	 */
	public AddStringListCommand(GUIClient mainGui) {
		this.mainGui = mainGui;
		printOut = "Add String List";
	}

	/**
	 * Execute method
	 */
	@Override
	public String Execute() {
		String listName = mainGui.getTitle();
		if (listName.equals(""))
			return "Please enter a title for the list";
		StringList list = new StringList(listName);
		
		Command addWord = new AddWordCommand(list);
		Command printList = new PrintCommand(list);
		Command clearList = new ClearCommand(list);
		Command sortList = new SortCommand(list);
		ArrayList<Command> listOfCommands = new ArrayList<Command>();
		listOfCommands.add(addWord);
		listOfCommands.add(clearList);
		listOfCommands.add(sortList);
		new ListViewer(listOfCommands, printList, listName, list);
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
