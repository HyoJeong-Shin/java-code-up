package 자바실습;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickPracticeFrame extends JFrame {
	private JLabel label = new JLabel("C");
	public ClickPracticeFrame() {
		setTitle("");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		label.setBounds(100, 100, 10, 10);
		c.add(label);
		
		label.addMouseListener(new MyMouseAdapter());
		
		setSize(400, 400);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter { // MouseAdapter�� ��ӹ޾� ������ ����
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = (int)(Math.random()*350);
			int y = (int)(Math.random()*350);
			label.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new ClickPracticeFrame();
	}

}
