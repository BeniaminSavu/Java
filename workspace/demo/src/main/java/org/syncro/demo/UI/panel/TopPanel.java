package org.syncro.demo.UI.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class TopPanel {
	private JPanel panel = new JPanel(new GridBagLayout());
	private JCheckBox autocorrectCheckBox = new JCheckBox("<html>Enable AutoCorrect</html>");
	private JCheckBox additionalSugestionsCheckBox = new JCheckBox("<html>Use additional suggestions</html>");

	public TopPanel() {
		init();
	}

	private void init() {
		// panel.setBorder(BorderFactory.createTitledBorder("Top-Panel"));
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(1, 0, 1, 0, Color.BLUE));

		GridBagConstraints gbc = new GridBagConstraints();

		// add auto correct check box
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		autocorrectCheckBox.setBackground(Color.WHITE);
		autocorrectCheckBox.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					additionalSugestionsCheckBox.setEnabled(true);
				} else {
					additionalSugestionsCheckBox.setEnabled(false);
				}
				
			}
		});
		panel.add(autocorrectCheckBox, gbc);

		// add auto additional suggestions check box
		gbc.gridy = 1;
		gbc.gridx = 0;
		gbc.insets.left = 20;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		additionalSugestionsCheckBox.setBackground(Color.WHITE);
		additionalSugestionsCheckBox.setEnabled(false);
		panel.add(additionalSugestionsCheckBox, gbc);

		// add info label
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.insets.left = 0;
		gbc.insets.bottom = 0;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ImageIcon icon = new ImageIcon("src/main/resources/icon.png");
		panel.add(new JLabel(
				"<html>The AutoCorrect feature uses the same language options and the same  ignored elements as the spell checker</html>",
				icon, JLabel.LEFT), gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.insets.left = 25;
		gbc.insets.bottom = 10;
		gbc.insets.top = 5;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		JLabel link = new JLabel();
	    link.setText("<HTML><FONT color=\"#000099\"><U>Spell Check Options</U></FONT></HTML>");
	    link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    panel.add(link, gbc);

	}

	public JPanel getPanel() {
		return panel;
	}

}
