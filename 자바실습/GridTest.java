package 자바실습;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridTest extends JFrame {
	public GridTest() {
		setTitle("GridTest");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());	
		
		// BorderLayout.north�� �ش��ϴ� �г� ����
		JPanel p1 = new JPanel();
		
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("�л� ���� �Է�"));
		
		c.add(p1, BorderLayout.NORTH);
		
		
		// BorderLayout.center�� �ش��ϴ� �г� ����
		JPanel p2 = new JPanel();
		
		p2.setLayout(new GridLayout(5, 4, 3, 3));
		
		p2.add(new JLabel("�̸�"));
		p2.add(new JLabel("�й�"));
		p2.add(new JLabel("�а�"));
		p2.add(new JLabel("����ó"));
		
		for(int i=1; i<=16; i++)
			p2.add(new JTextField(""));
		
		c.add(p2, BorderLayout.CENTER);
		
		
		// BorderLayout.south�� �ش��ϴ� �г� ����
		JPanel p3 = new JPanel();
		
		p3.setLayout(new FlowLayout());

		p3.add(new JButton("�߰�"));
		p3.add(new JButton("���"));
		
		c.add(p3, BorderLayout.SOUTH);
			
		
		setSize(500, 280);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridTest();
	}

}
