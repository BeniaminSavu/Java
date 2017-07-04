package org.syncro.demo.UI.panel.bottom;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class SingleQuoteCheckBoxPanel {
	private JPanel panel = new JPanel(new GridBagLayout());
	private JCheckBox singleQuotesCheckBox = new JCheckBox("Replace 'Single quotes'");
	private JButton startSingleQuoteButton = new JButton("'");
	private JButton endSingleQuoteButton = new JButton("'");

	public SingleQuoteCheckBoxPanel() {
		init();
	}

	private void init() {
		panel.setBackground(Color.WHITE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.top = 10;
		
		//add single quote check box 
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		singleQuotesCheckBox.setBackground(Color.WHITE);
		singleQuotesCheckBox.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					startSingleQuoteButton.setEnabled(true);
					endSingleQuoteButton.setEnabled(true);
				} else {
					startSingleQuoteButton.setEnabled(false);
					endSingleQuoteButton.setEnabled(false);
				}
				
			}
		});
		panel.add(singleQuotesCheckBox, gbc);

		//add single quote start lable
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 30;
		gbc.anchor = GridBagConstraints.WEST;
		panel.add(new JLabel("Start quote "), gbc);

		//add single quote start button
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 0;
		gbc.anchor = GridBagConstraints.EAST;
		startSingleQuoteButton.setEnabled(false);
		panel.add(startSingleQuoteButton, gbc);

		//add single quote end label
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 30;
		gbc.anchor = GridBagConstraints.WEST;
		panel.add(new JLabel("End quote "), gbc);

		//add single quote end button
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets.left = 0;
		gbc.anchor = GridBagConstraints.EAST;
		endSingleQuoteButton.setEnabled(false);
		panel.add(endSingleQuoteButton, gbc);

	}

	public JPanel getPanel() {
		return panel;
	}
}
