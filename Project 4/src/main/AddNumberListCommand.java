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
	 * Count of lists instance
	 */
	private ListCounts listCount;

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
	public AddNumberListCommand() {
		printOut = "Add Number List";
	}

	/**
	 * Execute method
	 */
	@Override
	public String Execute() {
		String listName = "";
		NumberList list = new NumberList(listName);
		
		Command addNumber = new AddNumberCommand(list);
		Command printList = new PrintCommand(list);
		Command clearList = new ClearCommand(list);
		Command biggestNumber = new BiggestNumberCommand(list);
		ArrayList<Command> listOfCommands = new ArrayList<Command>();
		listOfCommands.add(addNumber);
		listOfCommands.add(clearList);
		listOfCommands.add(biggestNumber);
		ListViewer newList = new ListViewer(listOfCommands, printList, listName, list);
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
