package org.syncro.AutoCorrect.UI;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import org.syncro.AutoCorrect.UI.constant.PanelPadding;

public class AutoCorrectPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TopPanel topPanel = new TopPanel();
	private MiddlePanel middlePanel = new MiddlePanel();
	private BottomPanel bottomPanel = new BottomPanel();
	private ConfirmButtonsPanel confirmButtonsPanel = new ConfirmButtonsPanel();

	public void createGUI() {
		this.setBackground(Color.WHITE);
		this.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		addTopPanel(gbc);
		addMiddlePanel(gbc);
		addBottomPanel(gbc);
		addConfirmButtonsPanel(gbc);
	}

	private void addTopPanel(GridBagConstraints gbc) {

		gbc.insets.right = PanelPadding.RIGHT;
		gbc.insets.left = PanelPadding.LEFT;
		gbc.insets.top = PanelPadding.TOP;
		gbc.insets.bottom = PanelPadding.BOTTOM;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		topPanel.createGUI();
		this.add(topPanel, gbc);
	}

	private void addMiddlePanel(GridBagConstraints gbc) {
		gbc.insets.right = PanelPadding.RIGHT;
		gbc.insets.left = PanelPadding.LEFT;
		gbc.insets.top = PanelPadding.TOP;
		gbc.insets.bottom = PanelPadding.BOTTOM;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		middlePanel.createGUI();
		this.add(middlePanel, gbc);
	}

	private void addBottomPanel(GridBagConstraints gbc) {
		gbc.insets.right = PanelPadding.RIGHT;
		gbc.insets.left = PanelPadding.LEFT;
		gbc.insets.top = PanelPadding.TOP;
		gbc.insets.bottom = PanelPadding.BOTTOM;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		bottomPanel.createGUI();
		this.add(bottomPanel, gbc);
	}

	private void addConfirmButtonsPanel(GridBagConstraints gbc) {
		gbc.insets.right = PanelPadding.RIGHT;
		gbc.insets.left = PanelPadding.LEFT;
		gbc.insets.top = PanelPadding.TOP;
		gbc.insets.bottom = PanelPadding.BOTTOM;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		confirmButtonsPanel.createGUI();
		this.add(confirmButtonsPanel, gbc);
	}

}
