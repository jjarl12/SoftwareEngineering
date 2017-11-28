package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class CommandButton extends JButton implements ActionListener{

	private Command buttonCommand;
	
	public CommandButton(Command newCommand) {
		buttonCommand = newCommand;
		this.setText(buttonCommand.GetPrintOut());
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String returnString = buttonCommand.Execute();
		if (returnString != "")
			JOptionPane.showMessageDialog(this, returnString);
	}
}
