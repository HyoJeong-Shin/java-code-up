package 자바실습;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Hw3_JSlider extends JFrame {
	
	public Hw3_JSlider() {
		setTitle("20181030 신효");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JTextArea ta = new JTextArea(5,10);
		
		
		JSlider sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(20);
		sl.setMinorTickSpacing(5);
		
		
		c.add(new JScrollPane(ta), BorderLayout.NORTH);
		c.add(sl, BorderLayout.CENTER);
		
		
		sl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if(ta.getText().length() <= sl.getValue()) {
					sl.setValue(ta.getText().length());
				}else {
					ta.setText(ta.getText().substring(0,sl.getValue()));
				}
			}
			
		});
		
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int size = ta.getText().length() ;

				if(size >= 100) {
					ta.setText(ta.getText().substring(0,100));
				}
				
				sl.setValue(size);
			}
			
		});
		
		setSize(300, 220);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Hw3_JSlider();
	}

}
