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

public class ListViewer extends JFrame implements Observer {
	
	private JPanel mainPanel;
	
	private List myList;
	
	private JTextArea displayField;
	
	private Command printCommand;
	
	public ListViewer(ArrayList<Command> listOfCommands, Command printCommand, String listName, List myList) {
		this.myList = myList;
		myList.addObserver(this);
		this.printCommand = printCommand;
		setTitle(listName);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JPanel listPanel = new JPanel();
		displayField = new JTextArea();
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

	@Override
	public void update(Observable o, Object arg) {
		displayField.setText(printCommand.Execute()); 
	}

}
