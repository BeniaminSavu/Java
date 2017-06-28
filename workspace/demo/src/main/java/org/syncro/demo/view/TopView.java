package org.syncro.demo.view;

import java.awt.GridBagLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopView{
	private JPanel panel = new JPanel();
	private JCheckBox enableAutocorrect = new JCheckBox("Enable AutoCorrect");
	private JCheckBox additionalSugestions = new JCheckBox("Use additional suggestions");
	private JLabel information = new JLabel("The AutoCorrect feature uses the same language options and the same ignored elements as the spell checker");
	
	public TopView(){
		init();
	}

	private void init() {		
		panel.add(enableAutocorrect);
		panel.add(additionalSugestions);
		panel.add(information);
	}
	
	public JPanel getPanel(){
		return panel;
	}
	
	
}
