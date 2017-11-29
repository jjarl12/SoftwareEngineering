package main;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
		String newNumber = (String)JOptionPane.showInputDialog("Please type in a number:");
		if (newNumber == null)
			return "";
		try {
			try {
				int inputNumber = Integer.parseInt(newNumber);
				list.AddToList(inputNumber);
			} catch (Exception e) {
				double inputNumber = Double.parseDouble(newNumber);
				list.AddToList(inputNumber);
			}
		} catch (Exception e) {
			return "You did not enter a valid number.";
		}
		return "Number added successfully";
	}

	/**
	 * Constructor
	 * 
	 * @param list
	 */
	public AddNumberCommand(NumberList list) {
		this.list = list;
		printOut = "Enter numbers into List " + list.GetListName();
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
