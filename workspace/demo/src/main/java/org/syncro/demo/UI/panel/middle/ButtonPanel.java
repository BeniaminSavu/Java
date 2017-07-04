package org.syncro.demo.UI.panel.middle;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel {

	private JPanel panel = new JPanel(new GridBagLayout());
	private JButton addButton = new JButton("Add");
	private JButton removeButton = new JButton("Remove");

	public ButtonPanel() {
		init();
	}

	private void init() {
		GridBagConstraints gbc = new GridBagConstraints();
		// add the addButton and the remove button

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.WEST;
		panel.add(addButton, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.WEST;
		removeButton.setEnabled(false);
		panel.add(removeButton, gbc);

	}

	public JPanel getPanel() {
		return panel;
	}

	public JButton getRemoveButton() {
		return removeButton;
	}

}
