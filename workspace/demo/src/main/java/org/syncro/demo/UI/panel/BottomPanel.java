package org.syncro.demo.UI.panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

import org.syncro.demo.UI.panel.bottom.DoubleQuoteCheckBoxPanel;
import org.syncro.demo.UI.panel.bottom.SingleQuoteCheckBoxPanel;
import org.syncro.demo.UI.panel.bottom.SmartQuotesLabelPanel;

public class BottomPanel {
	private JPanel panel = new JPanel(new GridBagLayout());
	private DoubleQuoteCheckBoxPanel doubleQuotePanel = new DoubleQuoteCheckBoxPanel();
	private SingleQuoteCheckBoxPanel singleQuotePanel = new SingleQuoteCheckBoxPanel();
	private SmartQuotesLabelPanel smartQuoteLabelPanel = new SmartQuotesLabelPanel();
	private JButton restoreDefaultsButton = new JButton("Restore Defaults");
	

	public BottomPanel() {
		init();
	}

	private void init() {
		// panel.setBorder(BorderFactory.createTitledBorder("Bottom-Panel"));
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLUE));
		panel.setBackground(Color.WHITE);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		panel.add(smartQuoteLabelPanel.getPanel(), gbc);
		
		// add Single Quote Panel
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		panel.add(singleQuotePanel.getPanel(), gbc);

		// add Double Quote Panel
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 1;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		panel.add(doubleQuotePanel.getPanel(), gbc);

		// Restore Button
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridwidth = 2;
		gbc.insets.bottom = 5;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.fill = GridBagConstraints.NONE;
		panel.add(restoreDefaultsButton, gbc);
	}

	public JPanel getPanel() {
		return panel;
	}

}
