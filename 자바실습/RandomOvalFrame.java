package 자바실습;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyThread extends Thread{
	MyPanel p;
	private boolean flag;
	
	public MyThread(MyPanel p) {
		this.p = p;
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	synchronized public void play() {
		notify();
	}
	
	public void run() {
		try {
			synchronized(this) {
				wait();
			}
		}catch(InterruptedException e) {
			return;
		}
		while(true) {
			try {
				if(flag) {
					p.repaint();
					p.randomOval();
				}
				Thread.sleep(300);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}

class MyPanel extends JPanel{
	private int x, y, width, height;
	
	public void randomOval() {
		x = (int) (Math.random() * (getWidth() - getWidth() / 2));
		y = (int) (Math.random() * (getHeight() - getHeight() / 2));
		width = (int) (Math.random() * 250);
		height = (int) (Math.random() * 250);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		randomOval();
		g.setColor(Color.MAGENTA);
		g.fillOval(x, y, width, height);
	}
}

public class RandomOvalFrame extends JFrame {
	private MyThread th;
	private MyPanel p = new MyPanel();
	
	public RandomOvalFrame(){
		setTitle("20181030 신효정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(p);
		setSize(500,500);
		setVisible(true);
		
		th = new MyThread(p);
		th.start();
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				th.setFlag(true);
				th.play();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				th.setFlag(false);
			}
			
		});
	}
	
	public static void main(String[] args) {
		new RandomOvalFrame();
	}

}
