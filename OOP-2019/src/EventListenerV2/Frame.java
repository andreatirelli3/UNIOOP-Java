package EventListenerV2;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container conn = frame.getContentPane();
		conn.add(new Oggetti());
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
