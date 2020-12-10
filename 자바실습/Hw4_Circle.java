package 자바실습;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Circle{
	int x, y, w, h;
	public Circle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}
public class Hw4_Circle extends JFrame {
	MyPanel panel = new MyPanel();
	
	public Hw4_Circle(){
		setTitle("20181030신효정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(800, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		Vector<Circle> v = new Vector<Circle>();
		int fromx, fromy, tox, toy;
		int width,height;
		public MyPanel() {
			setLayout(null);
			MyAdapter l = new MyAdapter();
			this.addMouseListener(l);	// mousePressed, Released를 생성하기 위한 리스너
			this.addMouseMotionListener(l);		//mousedragged를 생성하기 위한 리스너
			
		}
		class MyAdapter extends MouseAdapter{

				@Override
				public void mousePressed(MouseEvent e) {
					fromx = e.getX();
					fromy = e.getY();
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					tox = e.getX();
					toy = e.getY();
					
					
					
					width = (fromx-tox)*2;
					height = (fromy-toy)*2;
					
					
					if(width<0) width=-width;
					if(height<0) height=-height;
					
					if(width<=height) {
						v.add(new Circle(fromx-(height/2),fromy-(height/2),height,height));
					}else if(width>height) {
						v.add(new Circle(fromx-(width/2),fromy-(width/2),width,width));
					}
					
					repaint();
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					tox = e.getX();
					toy = e.getY();
					
					width = (fromx-tox)*2;
					height = (fromy-toy)*2;
					
					
					if(width<0) width=-width;
					if(height<0) height=-height;
					
					
					repaint();	// 다시 그리기 요청
				}
				
			
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i=0; i<v.size(); i++) {
				Circle c = v.get(i);
				setForeground(Color.magenta);
				g.drawOval(c.x, c.y, c.w, c.h);
			}
			
			
			// dragged...
			setForeground(Color.magenta);
			if(width<=height) {
				g.drawOval(fromx-(height/2),fromy-(height/2),height,height);
			}else if(width>height) {
				g.drawOval(fromx-(width/2),fromy-(width/2),width,width);
			}
		}
	}
	public static void main(String[] args) {
		new Hw4_Circle();
	}

}
