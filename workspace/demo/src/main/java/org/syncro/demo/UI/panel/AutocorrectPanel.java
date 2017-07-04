package org.syncro.demo.UI.panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class AutocorrectPanel {

	private JPanel panel = new JPanel(new GridBagLayout());
	private TopPanel topPanel = new TopPanel();
	private MiddlePanel middlePanel = new MiddlePanel();
	private BottomPanel bottomPanel = new BottomPanel();
	private ConfirmButtonsPanel confirmPanel = new ConfirmButtonsPanel();

	public AutocorrectPanel() {
		init();
	}

	private void init() {
		GridBagConstraints gbc = new GridBagConstraints();
		panel.setBackground(Color.WHITE);

		gbc.insets.right = PanelPadding.RIGHT;
		gbc.insets.left = PanelPadding.LEFT;
		gbc.insets.top = PanelPadding.TOP;
		gbc.insets.bottom = PanelPadding.BOTTOM;
		// add top panel in the container Panel
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		panel.add(topPanel.getPanel(), gbc);

		// add middle panel in the container Panel
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		panel.add(middlePanel.getPanel(), gbc);

		// add bottom panel in the container Panel
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		panel.add(bottomPanel.getPanel(), gbc);
		
		//add confirm buttons panel
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		panel.add(confirmPanel.getPanel(), gbc);

	}

	public JPanel getPanel() {
		return panel;
	}
}
