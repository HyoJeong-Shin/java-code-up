package 자바실습;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class PaintCircle extends JFrame {
	MyPanel panel = new MyPanel();
	
	 public PaintCircle(){
		 	setTitle("이미지 위에 원 드래깅 연습");	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setContentPane(panel);
	       
	        setSize(400,400);
	        setVisible(true);
	    }
	 class MyPanel extends JPanel{
		 ImageIcon icon = new ImageIcon("images/back.jpg");
		 Image img = icon.getImage();
		 int x, y;
	        
	     public void paintComponent(Graphics g){
	         super.paintComponent(g);
	         g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	         addMouseMotionListener(new MouseMotionAdapter(){
	        	 public void mouseDragged(MouseEvent e){
	        		 x = e.getX();
		             y = e.getY();
		             repaint();
		         }
		     });
	            g.setColor(Color.GREEN);
	            g.fillOval(x, y, 40, 40);
	         
	        }
	    }
	public static void main(String[] args) {
		new PaintCircle();
	}

}
