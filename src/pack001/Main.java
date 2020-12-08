package pack001;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		Background b = new Background();
		
		JFrame gw = new JFrame();
		gw.setTitle("Whack");
		gw.setSize(750,700);
		gw.add(b);
		gw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gw.setVisible(true);
		
		
	}

}
