package org.syncro.demo.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import org.syncro.demo.UI.model.MyTableModel;

public class RemoveTableElementListener implements ActionListener {

	private JTable table;

	public RemoveTableElementListener(JTable table) {
		;
		this.table = table;
	}

	public void actionPerformed(ActionEvent e) {

		int selectedRow[] = table.getSelectedRows();
		TableModel model = table.getModel();
		MyTableModel myModel = (MyTableModel) model;

		if (selectedRow.length > 0) {
			for (int i = selectedRow.length - 1; i >= 0; i--) {
				int viewRowIndex = selectedRow[i];
				int convertRowIndexToModel = table.convertRowIndexToModel(viewRowIndex);
				myModel.removeRow(convertRowIndexToModel);

			}
		}
		myModel.fireTableDataChanged();

	}

}
