package 자바실습;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class question06_1 extends JFrame {
	MyPanel panel = new MyPanel();
	
	public question06_1() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int w = getWidth();
			int h = getHeight();
			for(int i=1; i<10; i++) {
				g.drawLine(0, (int)(h*0.1*i), w, (int)(h*0.1*i));
				g.drawLine((int)(w*0.1*i), 0, (int)(w*0.1*i), h);
			}
		}
	}
	public static void main(String[] args) {
		new question06_1();
	}

}
