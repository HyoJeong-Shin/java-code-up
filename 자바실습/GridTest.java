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
		
		// BorderLayout.north에 해당하는 패널 생성
		JPanel p1 = new JPanel();
		
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("학생 정보 입력"));
		
		c.add(p1, BorderLayout.NORTH);
		
		
		// BorderLayout.center에 해당하는 패널 생성
		JPanel p2 = new JPanel();
		
		p2.setLayout(new GridLayout(5, 4, 3, 3));
		
		p2.add(new JLabel("이름"));
		p2.add(new JLabel("학번"));
		p2.add(new JLabel("학과"));
		p2.add(new JLabel("연락처"));
		
		for(int i=1; i<=16; i++)
			p2.add(new JTextField(""));
		
		c.add(p2, BorderLayout.CENTER);
		
		
		// BorderLayout.south에 해당하는 패널 생성
		JPanel p3 = new JPanel();
		
		p3.setLayout(new FlowLayout());

		p3.add(new JButton("추가"));
		p3.add(new JButton("취소"));
		
		c.add(p3, BorderLayout.SOUTH);
			
		
		setSize(500, 280);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridTest();
	}

}
