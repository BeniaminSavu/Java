package org.syncro.demo.UI.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.syncro.demo.UI.model.MyTableModel;
import org.syncro.demo.UI.panel.middle.ButtonPanel;
import org.syncro.demo.listener.IconListener;
import org.syncro.demo.listener.RemoveTableElementListener;
import org.syncro.demo.sax.PersonHandler;
import org.syncro.demo.sax.entities.Person;

public class MiddlePanel {

	private JPanel panel = new JPanel(new GridBagLayout());
	private JComboBox<String> language;
	private JTable table;
	private ButtonPanel buttonPanel = new ButtonPanel();

	public MiddlePanel() {
		init();
	}

	private void init() {
		panel.setBackground(Color.WHITE);
		
		GridBagConstraints gbc = new GridBagConstraints();

		// add selectLanguage label
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		panel.add(new JLabel("Replacements for language: "), gbc);

		// add language combo box
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets.left = 10;
		gbc.insets.right = 10;
		String languages[] = { "C", "C++", "C#", "Java", "PHP", "Python" };
		language = new JComboBox<String>(languages);
		language.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
			          String item = (String)e.getItem();
			          MyTableModel dataModel = readData(item + ".xml");
			          table.setModel(dataModel);
			          dataModel.fireTableDataChanged();
			       }
				
			}
		});
		panel.add(language, gbc);
		
		//add icon
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.insets.left = 0;
		gbc.insets.right = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		JLabel icon = new JLabel("", new ImageIcon("src/main/resources/icon.png"), JLabel.LEFT);
		panel.add(icon, gbc);

		// add table
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 3;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.insets.top = 10;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.WEST;
		MyTableModel model = readData("C.xml");
		table = new JTable(model);
		table.setAutoCreateRowSorter(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		table.setPreferredScrollableViewportSize(new Dimension(scrollPane.getWidth(), scrollPane.getHeight()));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON1) {
					buttonPanel.getRemoveButton().setEnabled(true);
				}

				if (e.getButton() == MouseEvent.BUTTON2) {
					System.err.println("SCROLL");
				}

				if (e.getButton() == MouseEvent.BUTTON3 && e.getClickCount() == 1) {
					System.err.println("DREAPTA");
					
					int clickedRow = table.rowAtPoint(e.getPoint());
			        if (clickedRow >= 0 && clickedRow < table.getRowCount()) {
			            table.setRowSelectionInterval(clickedRow, clickedRow);
			        } else {
			            table.clearSelection();
			        }


					JPopupMenu contextualMenu = new JPopupMenu();

					JMenuItem jMenuItem = new JMenuItem("Sterge");
					jMenuItem.addActionListener(new RemoveTableElementListener(table));

					contextualMenu.add(jMenuItem);
					contextualMenu.show(table, e.getX(), e.getY());
				}

			}
		});
		panel.add(scrollPane, gbc);
		
		

		// add the buttons panel
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.insets.top = 3;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.EAST;
		panel.add(buttonPanel.getPanel(), gbc);

		buttonPanel.getRemoveButton().addActionListener(new RemoveTableElementListener(table));
		icon.addMouseListener(new IconListener());
	}

	private MyTableModel readData(String file) {
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

	public JPanel getPanel() {
		return panel;
	}

	public JTable getTable() {
		return table;
	}

}
