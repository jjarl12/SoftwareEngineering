package main;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Client of project
 * @author Jonathan Jarl
 *
 */
public class GUIClient extends JFrame{
	
	/**
	 * list of commands
	 */
	private ArrayList<Command> commands;
	
	/**
	 * main panel of gui
	 */
	private JPanel mainPanel;
	
	/**
	 * The add string list button
	 */
	private CommandButton addStringList;
	
	/**
	 * The add number list button
	 */
	private CommandButton addNumberList;
	
	/**
	 * The title textfield
	 */
	private JTextField title;
		
	/**
	 * Client constructor
	 */
	public GUIClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Project 4");
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,2));
		JLabel titleLabel = new JLabel();
		titleLabel.setText("List Name:");
		mainPanel.add(titleLabel);
		
		title = new JTextField();
		mainPanel.add(title);
		
		AddStringListCommand newStringListCommand = new AddStringListCommand(this);
		addStringList = new CommandButton(newStringListCommand);
		mainPanel.add(addStringList);
		
		AddNumberListCommand newNumberListCommand = new AddNumberListCommand(this);
		addNumberList = new CommandButton(newNumberListCommand);
		mainPanel.add(addNumberList);
		setContentPane(mainPanel);
		setPreferredSize(new Dimension(500,300));
		setVisible(true);
		pack();
	}
	
	/**
	 * Getter for title textfield
	 */
	public String getTitle() {
		String listTitle = title.getText();
		title.setText("");
		return listTitle;
	}
	
	public static void main(String[] args) {
		new GUIClient();
	}
}
