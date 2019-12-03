package TabellaJava;

import java.awt.*;
import javax.swing.*;
import java.util.Vector;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Rubrica");
		// frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container conn = frame.getContentPane();
		Pannello p = new Pannello();
		conn.add(p);
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

}
