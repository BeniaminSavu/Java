package org.syncro.demo.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame{

	private JPanel panelContainer = new JPanel(new GridBagLayout());
	private TopView topView = new TopView();
	private CenterView centerView = new CenterView();
	private BottomView bottomView = new BottomView();

	public MainWindow(){
		
	}
	
	public MainWindow(String title) {
		super(title);
		init();
	}

	private void init() {
		
		GridBagConstraints gbc = new GridBagConstraints();
		this.getContentPane().add(panelContainer);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelContainer.add(topView.getPanel(), gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		panelContainer.add(centerView.getPanel(), gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		panelContainer.add(bottomView.getPanel(), gbc);
		
		this.pack();
		
		
	}
}
