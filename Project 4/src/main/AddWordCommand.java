package main;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Add Word Command
 * 
 * @author Jonathan Jarl
 *
 */
public class AddWordCommand implements Command {

	/**
	 * The list object
	 */
	private StringList list;

	/**
	 * Holds main system print out
	 */
	private String printOut;

	/**
	 * AddCommand execute method
	 */
	@Override
	public String Execute() {
		
		String word = (String)JOptionPane.showInputDialog("Please type in a word:");			
		if (!word.equals("0")) {
			list.AddToList(word);
			}
		return "Word added successfully";
	}

	/**
	 * AddCommand constructor
	 * 
	 * @param list
	 */
	public AddWordCommand(StringList list) {
		this.list = list;
		printOut = "Enter words into List " + list.GetListName();
	}

	/**
	 * Getter for printout
	 */
	public String GetPrintOut() {
		return printOut;
	}
}
