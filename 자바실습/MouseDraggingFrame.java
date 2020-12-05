package 자바실습;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseDraggingFrame extends JFrame {
	public MouseDraggingFrame() {
		setTitle("�巡�뵿�� YELLOW");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		
		c.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseMoved(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			
		});
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}
