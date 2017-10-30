import java.util.ArrayList;

/**
 * Project 2
 * 1203
 * @author Jonathan Jarl
 *
 */
public class Client {

	public static void main(String[] args) {
		new Client(2);
	}
	
	/**
	 * Client Constructor that creates program
	 * @param numLists
	 */
	public Client(int numLists) {
		ArrayList<Command> commands = new ArrayList<Command>();
		ListCounts listCount = new ListCounts();
		Invoker invoker = new Invoker(commands);
		Command addNumberList = new AddNumberListCommand(listCount, invoker);
		Command addStringList = new AddStringListCommand(listCount, invoker);
		Command quit = new QuitCommand();
		invoker.AddCommands(addStringList);
		invoker.AddCommands(addNumberList);
		invoker.AddCommands(quit);
		invoker.Main();
	}
}