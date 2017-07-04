package org.syncro.AutoCorrect.UI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class TopPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox autocorrectCheckBox = new JCheckBox("<html>Enable AutoCorrect</html>");
	private JCheckBox additionalSugestionsCheckBox = new JCheckBox("<html>Use additional suggestions</html>");

	public void createGUI() {
		this.setBackground(Color.WHITE);
		this.setBorder(new MatteBorder(1, 0, 1, 0, Color.BLUE));
		this.setLayout(new GridBagLayout());
	

		GridBagConstraints gbc = new GridBagConstraints();

		addAutoCorrectChackBox(gbc);
		addSugestionsCheckBox(gbc);
		addAutoCorrectInformationLabel(gbc);
		addLink(gbc);

	}

	private void addAutoCorrectChackBox(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
		autocorrectCheckBox.setBackground(Color.WHITE);
		this.add(autocorrectCheckBox, gbc);
	}

	private void addSugestionsCheckBox(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 20;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		additionalSugestionsCheckBox.setBackground(Color.WHITE);
		additionalSugestionsCheckBox.setEnabled(false);
		this.add(additionalSugestionsCheckBox, gbc);

	}

	private void addAutoCorrectInformationLabel(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 1;
		gbc.weighty = 1;
		ImageIcon icon = new ImageIcon("src/main/resources/icon.png");
		this.add(new JLabel(
				"<html>The AutoCorrect feature uses the same language options and the same  ignored elements as the spell checker</html>",
				icon, JLabel.LEFT), gbc);

	}

	private void addLink(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 25;
		gbc.insets.top = 5;
		gbc.insets.bottom = 10;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;

		JLabel link = new JLabel();
		link.setText("<HTML><FONT color=\"#000099\"><U>Spell Check Options</U></FONT></HTML>");
		link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.add(link, gbc);

	}

	public JCheckBox getAutocorrectCheckBox() {
		return autocorrectCheckBox;
	}

	public JCheckBox getAdditionalSugestionsCheckBox() {
		return additionalSugestionsCheckBox;
	}

}
