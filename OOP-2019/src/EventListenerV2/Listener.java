package EventListenerV2;

import java.awt.event.*;
import javax.swing.*;

public class Listener implements ActionListener{
	private JLabel l; // Oggetto su cui agisce Listener
	
	public Listener(JLabel label) {
		l = label;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(l.getText().equals("Tizio"))
			l.setText("Caio");
		else
			l.setText("Tizio");
	}

}
