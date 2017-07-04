package org.syncro.demo.UI.panel.bottom;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class SmartQuotesLabelPanel {
	
	private JPanel panel = new JPanel(new GridBagLayout());
	private JLabel label = new JLabel("<HTML><B>Smart quotes</B></HTML>");
	private JSeparator sep = new JSeparator();
	
	public SmartQuotesLabelPanel(){
		init();
	}

	private void init() {
		panel.setBackground(Color.WHITE);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		//add label
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		panel.add(label, gbc);
		
		//add separator
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.insets.left = 5;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel.add(sep, gbc);
		
	}
	
	public JPanel getPanel(){
		return panel;
	}
}
