package org.syncro.demo.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomView {
	private JPanel panel = new JPanel();
	private JCheckBox singelQuotes = new JCheckBox("Replace 'Single quotes'");
	private JCheckBox doubleQuotes = new JCheckBox("Replace \"Double quotes\"");
	private JLabel startSingleQuote = new JLabel("Start quote");
	private JLabel endSingleQuote = new JLabel("End quote");
	private JLabel startDoubleQuote = new JLabel("Start quote");
	private JLabel endDoubleQuote = new JLabel("End quote");
	private JButton restoreDefaults = new JButton("Restore Defaults");
	
	public JPanel getPanel() {
		return panel;
	}

}
