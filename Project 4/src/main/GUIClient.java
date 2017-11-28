package main;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIClient extends JFrame{
	
	private ArrayList<Command> commands;
	
	private JPanel mainPanel;
	
	private CommandButton addStringList;
	
	private CommandButton addNumberList;
	
	private JTextField title;
		
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
		
		AddStringListCommand newStringListCommand = new AddStringListCommand();
		addStringList = new CommandButton(newStringListCommand);
		mainPanel.add(addStringList);
		
		AddNumberListCommand newNumberListCommand = new AddNumberListCommand();
		addNumberList = new CommandButton(newNumberListCommand);
		mainPanel.add(addNumberList);
		setContentPane(mainPanel);
		setPreferredSize(new Dimension(600,400));
		setVisible(true);
		pack();
	}
	
	public static void main(String[] args) {
		new GUIClient();
	}
}
