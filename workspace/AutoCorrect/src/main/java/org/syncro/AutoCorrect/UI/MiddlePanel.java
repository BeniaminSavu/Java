package org.syncro.AutoCorrect.UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.syncro.AutoCorrect.model.MyTableModel;
import org.syncro.AutoCorrect.sax.Person;
import org.syncro.AutoCorrect.sax.PersonHandler;

public class MiddlePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> language;
	private JTable table;
	private ButtonPanel buttonPanel = new ButtonPanel();

	public void createGUI() {
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		addSelectLanguageLabel(gbc);
		addLanguageComboBox(gbc);
		addInformationIcon(gbc);
		addTable(gbc);
		addButtonsPanel(gbc);

	}

	private void addSelectLanguageLabel(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		this.add(new JLabel("Replacements for language: "), gbc);

	}

	private void addLanguageComboBox(GridBagConstraints gbc) {
		gbc.insets.right = 10;
		gbc.insets.left = 10;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 0;

		String languages[] = { "C", "C++", "C#", "Java", "PHP", "Python" };
		language = new JComboBox<String>(languages);
		this.add(language, gbc);
	}

	private void addInformationIcon(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 0;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;

		JLabel icon = new JLabel("", new ImageIcon("src/main/resources/icon.png"), JLabel.LEFT);
		this.add(icon, gbc);
	}

	private void addTable(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 10;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridwidth = 3;

		MyTableModel model = readFile("C.xml");
		table = new JTable(model);
		table.setAutoCreateRowSorter(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		table.setPreferredScrollableViewportSize(new Dimension(scrollPane.getWidth(), scrollPane.getHeight()));
		this.add(scrollPane, gbc);
	}

	private void addButtonsPanel(GridBagConstraints gbc) {
		gbc.insets.right = 0;
		gbc.insets.left = 0;
		gbc.insets.top = 3;
		gbc.insets.bottom = 0;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridwidth = 3;
		buttonPanel.createGUI();
		this.add(buttonPanel, gbc);

	}

	private MyTableModel readFile(String file) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		List<Person> persons = null;
		try {
			SAXParser saxParser = saxParserFactory.newSAXParser();
			PersonHandler handler = new PersonHandler();

			File xmlFile = new File("src/main/resources/" + file);
			saxParser.parse(xmlFile, handler);
			persons = handler.getPersons();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new MyTableModel(persons);
	}

}
