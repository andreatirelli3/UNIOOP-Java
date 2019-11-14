package OminoFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
// import javax.swing.JFrame;
import javax.swing.JPanel;

import java.net.*;

public class Omino extends JPanel{
	private Image img;
	
	public Omino() throws MalformedURLException {
		// img = Toolkit.getDefaultToolkit().createImage("bg.jpg");
		img = Toolkit.getDefaultToolkit().createImage(new URL("https://3.bp.blogspot.com/-c5My9eeBsNg/XB6kDj_uMyI/AAAAAAAADTM/2HLl_iXLlPwQQhERNa4Ju5U1g01_R-3SwCHMYCw/s1600/not-so-blissful-anymore-windows-xp-bliss-wallpaper-know-your-meme.jpg"));
		loadImage(img);
	}
	
	 private void loadImage(Image img) {
	    try {
	      MediaTracker track = new MediaTracker(this);
	      track.addImage(img, 0);
	      track.waitForID(0);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	 }
	
	@Override
	public synchronized void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawImage(img, 0, 0, null);
		
		g.setColor(Color.orange);
		// Head
		g.drawOval(350, 100, 50, 50);
		// Body
		g.drawLine(375, 150, 375, 300);
		// Hans
		g.drawLine(375, 150, 325, 220);
		g.drawLine(375, 150, 425, 220);
		// Legs
		g.drawLine(375, 300, 335, 400);
		g.drawLine(375, 300, 415, 400);
		
		// Umbrella
		g.drawLine(325, 230, 325, 45);
		g.drawLine(225, 45, 425, 45);
		g.drawLine(225, 45, 325, 30);
		g.drawLine(325, 30, 425, 45);
	}
}
