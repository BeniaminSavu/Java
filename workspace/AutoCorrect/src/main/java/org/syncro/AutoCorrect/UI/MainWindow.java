package org.syncro.AutoCorrect.UI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AutoCorrectPanel autocorrectPanel = new AutoCorrectPanel();
	private DictionaryPanel dictionaryPanel = new DictionaryPanel();

	/**
	 * Used to determine which of the autocorrectPanel and dictionaryPanel is
	 * set to be views by the user;
	 */
	private int activePanel;

	public MainWindow() {
		super("Demo");
		activePanel = 0;
		autocorrectPanel.createGUI();
		dictionaryPanel.createGUI();

		
		this.add(autocorrectPanel);
		//this.add(dictionaryPanel);
		this.pack();
	}

}
