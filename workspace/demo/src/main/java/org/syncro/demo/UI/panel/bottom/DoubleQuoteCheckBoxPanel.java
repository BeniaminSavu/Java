package org.syncro.demo.UI.panel.bottom;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class DoubleQuoteCheckBoxPanel {
	private JPanel panel = new JPanel(new GridBagLayout());
	private JCheckBox doubleQuotesCheckBox = new JCheckBox("Replace \"Double quotes\"");
	private JButton startDoubleQuoteButton = new JButton("\"");
	private JButton endDoubleQuoteButton = new JButton("\"");

	public DoubleQuoteCheckBoxPanel() {
		init();
	}

	private void init() {
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setBackground(Color.WHITE);
		
		gbc.insets.top = 10;
		// add double quotes check box
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 2;
		gbc.insets.left = 20;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		doubleQuotesCheckBox.setBackground(Color.WHITE);
		doubleQuotesCheckBox.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					startDoubleQuoteButton.setEnabled(true);
					endDoubleQuoteButton.setEnabled(true);
				} else {
					startDoubleQuoteButton.setEnabled(false);
					endDoubleQuoteButton.setEnabled(false);
				}
				
			}
		});
		panel.add(doubleQuotesCheckBox, gbc);

		// add starting quote label
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 20 + 30;
		gbc.anchor = GridBagConstraints.WEST;
		panel.add(new JLabel("Start quote "), gbc);

		// add starting quote button
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 0;
		gbc.anchor = GridBagConstraints.EAST;
		startDoubleQuoteButton.setEnabled(false);
		panel.add(startDoubleQuoteButton, gbc);

		// add end quote label
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 20 + 30;
		gbc.anchor = GridBagConstraints.WEST;
		panel.add(new JLabel("End quote "), gbc);

		// add end quote button
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 0;
		gbc.anchor = GridBagConstraints.EAST;
		endDoubleQuoteButton.setEnabled(false);
		panel.add(endDoubleQuoteButton, gbc);

	}

	public JPanel getPanel() {
		return panel;
	}

}
