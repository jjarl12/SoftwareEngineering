package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * The list viewer class
 * @author Jonathan Jarl
 *
 */
public class ListViewer extends JFrame implements Observer {
	
	/**
	 * The main panel
	 */
	private JPanel mainPanel;
	
	/**
	 * The list associated with the view
	 */
	private List myList;
	
	/**
	 * The printout of the list
	 */
	private JTextArea displayField;
	
	/**
	 * The command to pull the printout
	 */
	private Command printCommand;
	
	/**
	 * Constructor
	 * @param listOfCommands
	 * @param printCommand
	 * @param listName
	 * @param myList
	 */
	public ListViewer(ArrayList<Command> listOfCommands, Command printCommand, String listName, List myList) {
		this.myList = myList;
		myList.addObserver(this);
		this.printCommand = printCommand;
		setTitle(listName);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel listPanel = new JPanel();
		displayField = new JTextArea();
		displayField.setEditable(false);
		listPanel.add(displayField);
		mainPanel.add(listPanel, BorderLayout.WEST);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(listOfCommands.size(), 1));
		for (int i = 0; i < listOfCommands.size(); i++) {
			CommandButton button = new CommandButton(listOfCommands.get(i));
			buttonPanel.add(button);
		}
		
		mainPanel.add(buttonPanel, BorderLayout.EAST);
		setContentPane(mainPanel);
		setPreferredSize(new Dimension(600,400));
		setVisible(true);
		pack();
	}

	/**
	 * Updates the display field
	 */
	@Override
	public void update(Observable o, Object arg) {
		displayField.setText(printCommand.Execute()); 
	}

}
