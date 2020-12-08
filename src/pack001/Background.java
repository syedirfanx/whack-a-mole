package pack001;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import pack001.Coordinate;

public class Background extends JPanel implements MouseMotionListener, KeyListener {

	
	public Coordinate[] moles = new Coordinate[9];
	public Random r = new Random();
	public Coordinate current;
	public Hammer[] hammer = new Hammer[0] ;
	
	static int score = 0;
	static int lifes = 3 ;
	
	public Background(){
		
		super();
		
		moles[0] = new Coordinate(35,50,true);
		moles[1] = new Coordinate(195,50,true);
		moles[2] = new Coordinate(347,50,true);
		
		moles[3] = new Coordinate(35,270,true);
		moles[4] = new Coordinate(195,270,true);
		moles[5] = new Coordinate(347,270,true);
		
		moles[6] = new Coordinate(35,490,true);
		moles[7] = new Coordinate(195,490,true);
		moles[8] = new Coordinate(347,490,true);
		
		//for(int i = 0; i < hammer.length; i++){
			
			//hammer[i] = new Hammer(350,250 ,"images//Hammer.png");
			
		//}
		
		
		super.addKeyListener(this);
		super.addMouseMotionListener(this);
		
		
	}
	
	public void paint(Graphics g){
		
		ImageIcon background = new ImageIcon("Images//Background.jpg");
		g.drawImage(background.getImage(),0,0,null);
		
		ImageIcon background2 = new ImageIcon("Images//Background.jpg");
		g.drawImage(background2.getImage(),0,220,null);
		
		ImageIcon background3 = new ImageIcon("Images//Background.jpg");
		g.drawImage(background3.getImage(),0,440,null);
		
		ImageIcon mole = new ImageIcon("Images//mole1.png");
		/*g.drawImage(mole1.getImage(),35,27,null);
		
		ImageIcon mole2 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole2.getImage(),195,27,null);
		
		ImageIcon mole3 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole3.getImage(),347,27,null);
		
		ImageIcon mole4 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole4.getImage(),35,250,null);
		
		ImageIcon mole5 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole5.getImage(),195,250,null);
		
		ImageIcon mole6 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole6.getImage(),347,250,null);
		
		ImageIcon mole7 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole7.getImage(),35,470,null);
		
		ImageIcon mole8 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole8.getImage(),195,470,null);
		
		ImageIcon mole9 = new ImageIcon("Images//mole1.jpg");
		g.drawImage(mole9.getImage(),347,470,null);
		
		//for(int i = 0; i < moles.length; i++)
			//moles[i].draw(g);
		
		*/
		
		
		ImageIcon score = new ImageIcon("Images//score.png");
		g.drawImage(score.getImage(),500,50,null);
		
		ImageIcon life= new ImageIcon("Images//life.png");
		if(lifes == 3){
			g.drawImage(life.getImage(),500,280,null);
			g.drawImage(life.getImage(),570,280,null);
			g.drawImage(life.getImage(),640,280,null);
			
		}
		else if(lifes == 2){
			g.drawImage(life.getImage(),500,280,null);
			g.drawImage(life.getImage(),570,280,null);
		}
		else if(lifes == 1){
			g.drawImage(life.getImage(),500,280,null);
		}
	
		ImageIcon level = new ImageIcon("Images//level.png");
		g.drawImage(level.getImage(),500,460,null);
		
		try{
			Thread.sleep(1000);
		} catch(Exception e){
		
		}
		
		int i = r.nextInt(9);
		Coordinate temp = moles[i];
		current = temp;
		if(moles[i].isAlive() == true){
			g.drawImage(((ImageIcon) mole).getImage(),temp.getX(),temp.getY(), null);
			//System.out.println(current.getY());
		}
		repaint();
		
		}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent d ) {
		int dx= d.getX();
		int dy= d.getY();
		
		hammer[0].setM(dx);
		hammer[0].setN(dy);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(MouseEvent c) {
		if(c.getButton() == MouseEvent.BUTTON1){
			
			checkCollision ();
		}
		
	}

	public void checkCollision(){
		
		Rectangle hammerReact = new Rectangle(hammer[0].getM(),hammer[0].getN(),85,85);
		
		for(int i = 0; i < moles.length; i++){
			
			Rectangle molesRect = new Rectangle(current.getX(),current.getY(),99,92);
			
			if(hammerReact.intersects(molesRect) == true){
				
				moles[i].setX(-100);
				hammer[0].setN(-100);
				
				moles[i].setAlive(false);
				score++;
				
				moles[i].setAlive(true);
				lifes--;
			}
			
			
		}

		
		
		
	
	}
}