package TabellaJava;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JTable;

public class Pannello extends JPanel{
	public Pannello() {
		Vector v = new Vector(3);
		Contatto a1 = new Contatto("Giacomo", "Cabri", "Campi", "11443");
		Contatto a2 = new Contatto("Pino", "Cabri", "Vignolese", "546456");
		Contatto a3 = new Contatto("Ugo", "Cabri", "Roma", "934909");
		
		v.add(a1);
		v.add(a2);
		v.add(a3);
		
		Tabella t = new Tabella(v);
		JTable tab = new JTable(t);
		
		this.add(tab);
	}
}
