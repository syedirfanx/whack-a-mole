package pack001;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Hammer {
	
	private int m,n;
	private String imagepath;
	
	public Hammer(int m , int n , String imagepath) {
		
		this.m = m;
		this.n=n;
		this.imagepath=imagepath;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public void draw(Graphics g){
		
		ImageIcon hammer = new ImageIcon("Images//Hammer.png");
		g.drawImage(hammer.getImage(), m, n, null);
		
		
	}

}
