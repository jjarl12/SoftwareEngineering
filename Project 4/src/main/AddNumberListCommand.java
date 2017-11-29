package main;

import java.util.ArrayList;

/**
 * Add a number command
 * 
 * @author Jonathan Jarl
 *
 */
public class AddNumberListCommand implements Command {

	/**
	 * Print out for command
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
	public AddNumberListCommand(GUIClient mainGui) {
		this.mainGui = mainGui;
		printOut = "Add Number List";
	}

	/**
	 * Execute method
	 */
	@Override
	public String Execute() {
		String listName = mainGui.getTitle();
		if (listName.equals(""))
			return "Please enter a title for the list";
		NumberList list = new NumberList(listName);
		
		Command addNumber = new AddNumberCommand(list);
		Command printList = new PrintCommand(list);
		Command clearList = new ClearCommand(list);
		Command biggestNumber = new BiggestNumberCommand(list);
		ArrayList<Command> listOfCommands = new ArrayList<Command>();
		listOfCommands.add(addNumber);
		listOfCommands.add(clearList);
		listOfCommands.add(biggestNumber);
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
