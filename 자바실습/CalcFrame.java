package 자바실습;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcFrame extends JFrame {
	public CalcFrame() {
		setTitle("");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField num1 = new JTextField("" ,5);
		JTextField num2 = new JTextField("" ,5);
		JTextField result = new JTextField("" ,10);
		
		JLabel mul = new JLabel("X");
		JButton btn = new JButton("=");
		
		c.add(num1);
		c.add(mul);
		c.add(num2);
		c.add(btn);
		c.add(result);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				result.setText(String.valueOf(x*y));
			}
			
		});
		
		
		setSize(500, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalcFrame();
	}

}
