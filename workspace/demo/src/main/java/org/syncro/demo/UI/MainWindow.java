package org.syncro.demo.UI;

import java.awt.Color;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.syncro.demo.UI.panel.AutocorrectPanel;
import org.syncro.demo.UI.panel.BottomPanel;
import org.syncro.demo.UI.panel.MiddlePanel;
import org.syncro.demo.UI.panel.TopPanel;

public class MainWindow extends JFrame {

	private AutocorrectPanel autocorrectPanel = new AutocorrectPanel();

	public MainWindow() {

	}

	public MainWindow(String title) {
		super(title);
		init();
	}

	private void init() {
		this.add(autocorrectPanel.getPanel());
		this.pack();

	}
}
