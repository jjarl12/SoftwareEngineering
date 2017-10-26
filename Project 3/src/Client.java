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
		Command addNumberList = new AddNumberListCommand();
		Command addStringList = new AddStringListCommand();
		Command quit = new QuitCommand();
		commands.add(addNumberList);
		commands.add(addStringList);
		commands.add(quit);
		new Invoker(commands);
	}
}