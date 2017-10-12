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
	private Command[] commands;
	
	/**
	 * Invoker constructor
	 * @param commands
	 */
	public Invoker(Command[] commands) {
		this.commands = commands;
		Main();
	}
	
	/**
	 * Main system print out
	 */
	public void Main() {
		while(1 == 1) {
			int option = 0;
			System.out.println("String List Menu");
			for (int i = 0; i < commands.length; i++) {
				System.out.println((i + 1) + ":" + commands[i].GetPrintOut());
			}
			System.out.println("Please pick an option:");
			Scanner input = new Scanner(System.in);
			option = input.nextInt() - 1;
			if(option >= 0 && option < commands.length)
				System.out.print(commands[option].Execute());
			else
				System.out.println("Please select a valid option");
			System.out.println();
		}
	}
}