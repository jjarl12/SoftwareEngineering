package main;
import java.util.Scanner;

/**
 * This command adds a number to a list
 * 
 * @author Jonathan Jarl
 *
 */
public class AddNumberCommand implements Command {

	/**
	 * List the number is added to
	 */
	private NumberList list;

	/**
	 * PrintOut of the command
	 */
	private String printOut;

	/**
	 * Execute which adds numbers to the list
	 */
	@Override
	public String Execute() {
		System.out.println("\nEnter numbers into List " + list.GetListNumber() + " one at at time");
		System.out.println("Enter the word \"quit\" to stop");
		String newNumber = "";
		Scanner input = new Scanner(System.in);
		while (!newNumber.equals("quit")) {
			System.out.print("Enter number " + list.GetItemInList() + ": ");
			newNumber = input.nextLine();
			if (!newNumber.equals("quit")) {
				try {
					try {
						int inputNumber = Integer.parseInt(newNumber);
						list.AddToList(inputNumber);
					} catch (Exception e) {
						double inputNumber = Double.parseDouble(newNumber);
						list.AddToList(inputNumber);
					}
				} catch (Exception e) {
					System.out.println("Invalid Number");
				}
			}
		}
		return "";
	}

	/**
	 * Constructor
	 * 
	 * @param list
	 */
	public AddNumberCommand(NumberList list) {
		this.list = list;
		printOut = "Enter numbers into List " + list.GetListNumber();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
