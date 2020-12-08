package pack001;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Coordinate {

	private int x , y;
	private boolean isAlive;

	public Coordinate(int x, int y,boolean isAlive) {
		
		this.x = x;
		this.y= y;
		this.isAlive = isAlive;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/*public void draw(Graphics g){
		
		ImageIcon mole = new ImageIcon("images//mole1.png");
		g.drawImage(mole.getImage(), x, y, null);
		
		
	}*/
	
	
	
	

}
