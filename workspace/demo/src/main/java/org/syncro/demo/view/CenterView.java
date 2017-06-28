package org.syncro.demo.view;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class CenterView {

	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Replacements for language");
	private JComboBox language = new JComboBox();
	private JTable table = new JTable();
	private JButton add = new JButton("add");
	private JButton remove = new JButton("remove");
	
	public JPanel getPanel() {
		return panel;
	}

}
