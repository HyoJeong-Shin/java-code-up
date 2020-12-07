package 자바실습;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FontTest extends JFrame {
	private JRadioButton [] radio = new JRadioButton [3]; // 라디오버튼 배열
	private String [] text = {"굴림", "돋움", "궁서"}; // 라디오버튼의 문자열
	
	JCheckBox bold, italic;
	int valBold = Font.PLAIN;
	int valItalic = Font.PLAIN;
	
	private Integer [] font_size = {15, 20, 25, 30}; // 콤보박스의 아이템
	private JComboBox<Integer> intCombo = new JComboBox<Integer>(font_size); // 문자열 콤보박스 
	
	JTextField tf2;
	
	String font="돋움";
	int size = 15;
	JLabel resultla;
	public FontTest() {
		setTitle("Font 설정");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel(new GridLayout(4,1));
		
		JPanel p1 = new JPanel(new BorderLayout());
		
		JPanel p1_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel la1= new JLabel("Font 설정");
		p1_1.add(la1);
		p1.add(p1_1, BorderLayout.WEST);
		
		JPanel p1_2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		ButtonGroup g = new ButtonGroup();	
		for(int i=0; i<radio.length; i++) { 
			radio[i] = new JRadioButton(text[i]); 
			g.add(radio[i]); 
			p1_2.add(radio[i]); 
		}
		
		
		
		p1.add(p1_2, BorderLayout.CENTER);
		
		panel.add(p1);
		
		
		JPanel p2 = new JPanel(new BorderLayout());
		
		JPanel p2_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel la2= new JLabel("Style 설정");
		p2_1.add(la2);
		p2.add(p2_1, BorderLayout.WEST);
		
		JPanel p2_2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		bold = new JCheckBox("BOLD");
		italic = new JCheckBox("ITALIC");
		
		  
		p2_2.add(bold);
		p2_2.add(italic);
		
		p2.add(p2_2, BorderLayout.CENTER);	
		
		panel.add(p2);
		
		
		JPanel p3 = new JPanel(new BorderLayout());
		
		JPanel p3_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel la3 = new JLabel("Size 설정");
		p3_1.add(la3);
		p3.add(p3_1, BorderLayout.WEST);
		
		JPanel p3_2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		intCombo.setPreferredSize(new Dimension(170,20)); 
		p3_2.add(intCombo);
		
		
		
		p3.add(p3_2, BorderLayout.CENTER);
		
		panel.add(p3);
		
		
		JPanel p4 = new JPanel(new BorderLayout());
		
		JPanel p4_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel la4 = new JLabel("Text 내용");
		p4_1.add(la4);
		p4.add(p4_1, BorderLayout.WEST);
		
		JPanel p4_2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		tf2 = new JTextField(15);
		
		p4_2.add(tf2);
		p4.add(p4_2, BorderLayout.CENTER);
		
		panel.add(p4);
		
		c.add(panel, BorderLayout.NORTH);
		
		
		JPanel resultPanel = new JPanel();
		Border resultBorder = BorderFactory.createTitledBorder("Font 설정 결과");
		resultPanel.setBorder(resultBorder);
		
		JLabel resultla = new JLabel();
		
		tf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				resultla.setText(t.getText());
				resultla.setFont(new Font(font, valBold + valItalic, size));
			}
		});
		
		
		

		intCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox<Integer> cb = (JComboBox<Integer>)e.getSource(); 
				int index = cb.getSelectedIndex(); 
				size= font_size[index]; 
				resultla.setFont(new Font(font, valBold + valItalic, size));
			}
		});
		
		bold.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 if (e.getSource() == bold) {
					   if (e.getStateChange() == ItemEvent.SELECTED) { 
					    valBold = Font.BOLD;  
					   } else {                                                    
					    valBold = Font.PLAIN;
					   }

					  } else if (e.getSource() == italic) {
					   if (e.getStateChange() == 1) {
					    valItalic = Font.ITALIC;
					   } else {
					    valItalic = Font.PLAIN;
					   }
					  }
				 resultla.setFont(new Font(font, valBold + valItalic, size));
				}
		});
		
		italic.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 if (e.getSource() == bold) {
					   if (e.getStateChange() == ItemEvent.SELECTED) { 
					    valBold = Font.BOLD;  
					   } else {                                                   
					    valBold = Font.PLAIN;
					   }

					  } else if (e.getSource() == italic) {
					   if (e.getStateChange() == 1) {
					    valItalic = Font.ITALIC;
					   } else {
					    valItalic = Font.PLAIN;
					   }
					  }
				 resultla.setFont(new Font(font, valBold + valItalic, size));
				}
		});
	
		for(int i=0; i<radio.length; i++) { // 3개의 라디오버튼에 대해
			radio[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.DESELECTED)  
						return;
					if(radio[0].isSelected()) { // 굴림이 선택된 경우
						font = text[0];
						resultla.setFont(new Font(font, valBold + valItalic, size));
					}
					else if(radio[1].isSelected()) { // 돋움이 선택된 경우
						font = text[1];
						resultla.setFont(new Font(font, valBold + valItalic, size));
					}
					else { // 궁서가 선택된 경우
						font = text[2];
						resultla.setFont(new Font(font, valBold + valItalic, size));
					}
				}
			}); // 라디오버튼에 Item 리스너 등록
		}
		
		
		resultPanel.add(resultla);
		c.add(resultPanel, BorderLayout.CENTER);		

		
		setSize(270, 270);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FontTest();
	}

}


