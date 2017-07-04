package org.syncro.AutoCorrect.UI;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class BottomPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DoubleQuoteCheckBoxPanel doubleQuotePanel = new DoubleQuoteCheckBoxPanel();
	private SingleQuoteCheckBoxPanel singleQuotePanel = new SingleQuoteCheckBoxPanel();
	private SmartQuotesLabelPanel smartQuoteLabelPanel = new SmartQuotesLabelPanel();
	private JButton restoreDefaultsButton = new JButton("Restore Defaults");
	
	public void createGUI() {
		this.setLayout(new GridBagLayout());
		this.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLUE));
		this.setBackground(Color.WHITE);

		GridBagConstraints gbc = new GridBagConstraints();
	}

}
