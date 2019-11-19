package EventiJava;

import java.awt.*;
import javax.swing.*;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container conn = frame.getContentPane();
		Bottoni b = new Bottoni();
		conn.add(b);
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
