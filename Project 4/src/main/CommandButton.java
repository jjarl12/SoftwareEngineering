package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Command Button class
 * @author Jonathan Jarl
 *
 */
public class CommandButton extends JButton implements ActionListener{

	/**
	 * Command associated with button press
	 */
	private Command buttonCommand;
	
	/**
	 * Constructor for command button
	 * @param newCommand
	 */
	public CommandButton(Command newCommand) {
		buttonCommand = newCommand;
		this.setText(buttonCommand.GetPrintOut());
		this.addActionListener(this);
	}
	
	/**
	 * Performs action on button click
	 */
	public void actionPerformed(ActionEvent e) {
		String returnString = buttonCommand.Execute();
		if (returnString != "")
			JOptionPane.showMessageDialog(this, returnString);
	}
}
