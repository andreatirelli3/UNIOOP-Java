package EventiJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Bottoni extends JPanel implements ActionListener{
	private JTextField t1, t2, t3, t4;
	private JButton swi;
	
	public Bottoni() {
		super();
		
		t1 = new JTextField(25); // Aggiunta la grandezza dei caratteri che possono essere immessi 25
		t2 = new JTextField(1); // Aggiunta la grandezza dei caratteri che possono essere immessi 1
		t3 = new JTextField(1); // Aggiunta la grandezza dei caratteri che possono essere immessi 1
		t4 = new JTextField(25); // Aggiunta la grandezza dei caratteri che possono essere immessi 25
		t4.setEditable(false);
		
		swi = new JButton("Sostituisci");
		swi.addActionListener(this); //in questo modo ho detto che e' il pannello stesso che rimane in ascolto per l'evento scatenato dal bottone
		
		this.add(t1);
		this.add(new JLabel("Vecchio carattere"));
		this.add(t2);
		this.add(new JLabel("Nuovo carattere"));
		this.add(t3);
		this.add(t4);
		this.add(swi);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		char c1 = t2.getText().charAt(0);
		char c2 = t3.getText().charAt(0);
		
		boolean state = true;
		String ends = "";
		for(int i = 0; i < t1.getText().length(); i++) {
			if(t1.getText().charAt(i) == c1) {
				ends = ends + c2;
				state = false;
			}
			else ends = ends + t1.getText().charAt(i);
		}
		
		if(state) {
			JOptionPane.showMessageDialog(null, 
                    "Carattere non trovato\n" + "Riprovare!", 
                    "Errore!", 
                    JOptionPane.WARNING_MESSAGE);
		}
		
		t4.setText(ends);
	}
	
}
