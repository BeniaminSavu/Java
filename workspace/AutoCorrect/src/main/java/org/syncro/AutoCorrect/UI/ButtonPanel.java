package org.syncro.AutoCorrect.UI;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton addButton = new JButton("Add");
	private JButton removeButton = new JButton("Remove");

	public void createGUI() {
		this.setLayout(new GridBagLayout());
		this.setBackground(Color.WHITE);

		GridBagConstraints gbc = new GridBagConstraints();

		addTheAddButton(gbc);
		addTheRemoveButton(gbc);
	}

	private void addTheAddButton(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		this.add(addButton, gbc);

	}

	private void addTheRemoveButton(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;

		removeButton.setEnabled(false);
		this.add(removeButton, gbc);

	}
}
