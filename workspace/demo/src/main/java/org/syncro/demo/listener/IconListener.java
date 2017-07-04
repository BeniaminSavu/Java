package org.syncro.demo.listener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.syncro.demo.UI.panel.PanelPadding;

public class IconListener extends MouseAdapter {

	private static int windowCount = 0;
	private JFrame informationWiondow;

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1 && windowCount < 1) {
			informationWiondow = new JFrame();
			windowCount++;
			JPanel panel = new JPanel(new GridBagLayout());
			panel.setBackground(Color.WHITE);
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(PanelPadding.TOP, PanelPadding.LEFT, PanelPadding.BOTTOM, PanelPadding.RIGHT);

			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.anchor = GridBagConstraints.WEST;
			gbc.fill = GridBagConstraints.NONE;
			JLabel icon = new JLabel("", new ImageIcon("src/main/resources/icon_dialog.png"), JLabel.LEFT);
			panel.add(icon, gbc);

			gbc.gridx = 1;
			gbc.gridy = 0;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbc.insets.left = 0;
			gbc.anchor = GridBagConstraints.WEST;
			gbc.fill = GridBagConstraints.HORIZONTAL;
			JLabel label = new JLabel(
					"<HTML>The available languages are detected based on a set of specified dictionaries used for the automatic correction. To add more dictionaries, see the \"AutoCorrect / Dictionaries\" options sub-page.</HTML>");
			label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
			panel.add(label, gbc);

			gbc.gridx = 0;
			gbc.gridy = 1;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbc.gridwidth = 2;
			gbc.insets.left = 0;
			gbc.anchor = GridBagConstraints.CENTER;
			gbc.fill = GridBagConstraints.NONE;
			JButton okButton = new JButton("OK");
			okButton.setMinimumSize(new Dimension(70, 25));
			panel.add(okButton, gbc);

			okButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					informationWiondow.setVisible(false);
					informationWiondow.dispose();
					windowCount--;
				}
			});

			informationWiondow.setResizable(false);
			informationWiondow.setPreferredSize(new Dimension(480, 130));
			informationWiondow.add(panel);
			informationWiondow.pack();
			informationWiondow.setTitle("Information");
			informationWiondow.setVisible(true);
			informationWiondow.setLocationRelativeTo(null);

		} else if (windowCount > 0){
			informationWiondow.requestFocus();
		}
	}

}
