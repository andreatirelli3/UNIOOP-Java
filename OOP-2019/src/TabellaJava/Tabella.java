package TabellaJava;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class Tabella extends AbstractTableModel{
	private Vector v = null;
	private String[] colName = {
		"Nome",
		"Cognome",
		"Abitazione",
		"Contatto"
	};
	
	public Tabella(Vector v) {
		this.v = v;
	}
	
	@Override
	public int getRowCount() {
		return v.size();
	}

	@Override
	public int getColumnCount() {
		return colName.length;
	}

	@Override
	public Object getValueAt(int row, int column) {
		Contatto c = (Contatto)v.elementAt(row);
		switch(column) {
			case 0: return c.getName();
			case 1: return c.getSurname();
			case 2: return c.getLoc();
			case 3: return c.getPhone();
			default: return "";
		}
	}
	
}
