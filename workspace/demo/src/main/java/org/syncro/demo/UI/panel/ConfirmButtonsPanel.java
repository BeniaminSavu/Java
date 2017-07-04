package org.syncro.demo.UI.panel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ConfirmButtonsPanel {
	private JPanel panel = new JPanel(new GridBagLayout());
	private JButton okButton = new JButton("OK");
	private JButton applyButton = new JButton("Apply");
	private JButton cancelButton = new JButton("Cancel");

	public ConfirmButtonsPanel() {
		init();
	}

	private void init() {
		GridBagConstraints gbc = new GridBagConstraints();
		Dimension buttonDimension = new Dimension(70, 25);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets.left = 0;
		gbc.insets.right = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		okButton.setPreferredSize(buttonDimension);
		panel.add(okButton, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.insets.left = 5;
		gbc.insets.right = 5;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		cancelButton.setPreferredSize(buttonDimension);
		panel.add(cancelButton, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.insets.left = 0;
		gbc.insets.right = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		applyButton.setPreferredSize(buttonDimension);
		panel.add(applyButton, gbc);

	}

	public JPanel getPanel() {
		return panel;
	}

}
