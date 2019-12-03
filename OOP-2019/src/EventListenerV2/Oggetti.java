package EventListenerV2;

import javax.swing.*;

public class Oggetti extends JPanel{
	public Oggetti() {
		super();
		JLabel j = new JLabel("Text");
		add(j);
		
		JButton b = new JButton("Click!");
		b.addActionListener(new Listener(j));
		add(b);
	}

}
