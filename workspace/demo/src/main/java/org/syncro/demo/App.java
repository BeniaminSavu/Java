package org.syncro.demo;

import org.syncro.demo.view.MainWindow;

public class App {
	public static void main(String[] args) {
		MainWindow window = new MainWindow("Demo application");
		
		window.setSize(400,500);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
	}
}
