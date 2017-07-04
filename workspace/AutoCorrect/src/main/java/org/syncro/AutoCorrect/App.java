package org.syncro.AutoCorrect;

import java.awt.Dimension;

import javax.swing.JFrame;

import org.syncro.AutoCorrect.UI.MainWindow;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MainWindow window = new MainWindow();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		window.setMinimumSize(new Dimension(600, 800));
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
