package OminoFrame;

import java.awt.*;
import java.net.MalformedURLException;

import javax.swing.*;

public class Pannel {
	public static void main(String args[]) throws MalformedURLException {
		JFrame frame = new JFrame("Omino");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		
		Container cjf = frame.getContentPane();
		Omino om = new Omino();
		cjf.add(om);
		
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
