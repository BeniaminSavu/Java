package org.syncro.AutoCorrect.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.syncro.AutoCorrect.sax.Person;

public class MyTableModel extends AbstractTableModel {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public String[] columnNames = { "Name", "Salary" };

	private List<Person> persons;

	public MyTableModel(List<Person> persons) {
		this.persons = persons;
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		int size;
		if (persons == null) {
			size = 0;
		} else {
			size = persons.size();
		}
		return size;
	}

	public Object getValueAt(int row, int col) {
		Object temp = null;
		if (col == 0) {
			temp = persons.get(row).getName();
		} else if (col == 1) {
			temp = persons.get(row).getSalary();
		}
		return temp;
	}

	// needed to show column names in JTable
	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Class getColumnClass(int col) {
		return String.class;
	}

	public void removeRow(int rowIndexToRemove) {
		if (persons != null && persons.size() > 0 && persons.size() > rowIndexToRemove) {
			persons.remove(rowIndexToRemove);
		}
	}

}