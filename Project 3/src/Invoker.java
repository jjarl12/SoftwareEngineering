import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project 2
 * 1203
 * @author Jonathan Jarl
 *
 */
public class Invoker {
	
	/**
	 * The list of command objects
	 */
	private ArrayList<Command> commands;
	
	/**
	 * Invoker constructor
	 * @param commands
	 */
	public Invoker(ArrayList<Command> commands) {
		this.commands = commands;
	}
	
	/**
	 * Add commands to list of commands
	 * @param command
	 */
	public void AddCommands(Command command) {
		commands.add(command);
	}
	
	/**
	 * Add commands to list of commands
	 * @param index
	 * @param command
	 */
	public void AddCommands(int index, Command command) {
		commands.set(index, command);
	}
	
	/**
	 * Getter for commands array
	 * @return
	 */
	public ArrayList<Command> GetCommands(){
		return commands;
	}
	
	/**
	 * Main system print out
	 */
	public void Main() {
		while(true) {
			int option = 0;
			System.out.println("String and Number List Menu");
			for (int i = 0; i < commands.size(); i++) {
				System.out.println((i + 1) + ":" + commands.get(i).GetPrintOut());
			}
			System.out.println("Please pick an option:");
			Scanner input = new Scanner(System.in);
			option = input.nextInt() - 1;
			if(option >= 0 && option < commands.size())
				System.out.print(commands.get(option).Execute());
			else
				System.out.println("Please select a valid option");
			System.out.println();
		}
	}
}