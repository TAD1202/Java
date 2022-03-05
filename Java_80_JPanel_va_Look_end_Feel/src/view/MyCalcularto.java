package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class MyCalcularto extends JFrame {
	public MyCalcularto() { 
		JFrame f = new JFrame("Myy Calcularto");
		f.setSize(300,300);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		JTextField jTextField = new JTextField(100);
		JPanel jpanel_heal = new JPanel();
		jpanel_heal.setLayout(new BorderLayout());
		jpanel_heal.add(jTextField, BorderLayout.CENTER);
			
		
		JButton jbutton_0 = new JButton("0");
		JButton jbutton_1 = new JButton("1");
		JButton jbutton_2 = new JButton("2");
		JButton jbutton_3 = new JButton("3");
		JButton jbutton_4 = new JButton("4");
		JButton jbutton_5 = new JButton("5");
		JButton jbutton_6 = new JButton("6");
		JButton jbutton_7 = new JButton("7");
		JButton jbutton_8 = new JButton("8");
		JButton jbutton_9 = new JButton("9");
		JButton jbutton_cong = new JButton("+");
		JButton jbutton_tru = new JButton("-");
		JButton jbutton_nhan = new JButton("x");
		JButton jbutton_chia = new JButton("/");
		JButton jbutton_bang = new JButton("=");
		
		JPanel jpanel_buttons = new JPanel();
		jpanel_buttons.setLayout(new GridLayout(5,3,5,5));
		
		
        jpanel_buttons.add(jbutton_0);
        jpanel_buttons.add(jbutton_1);
        jpanel_buttons.add(jbutton_2);
        jpanel_buttons.add(jbutton_3);
        jpanel_buttons.add(jbutton_4);
        jpanel_buttons.add(jbutton_5);
        jpanel_buttons.add(jbutton_6);
        jpanel_buttons.add(jbutton_7);
        jpanel_buttons.add(jbutton_8);
        jpanel_buttons.add(jbutton_9);
        jpanel_buttons.add(jbutton_cong);
        jpanel_buttons.add(jbutton_tru);
        jpanel_buttons.add(jbutton_nhan);
        jpanel_buttons.add(jbutton_chia);
        jpanel_buttons.add(jbutton_bang);
        
        f.setLayout( new BorderLayout());
        f.add(jpanel_heal, BorderLayout.NORTH);
        f.add(jpanel_buttons, BorderLayout.CENTER);
        
        
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        
      

	
	}	
public static void main(String[] args) {
	try {
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  //  gg
	}catch(Exception ex ) {
		ex.printStackTrace();
	}
	new MyCalcularto();
	
}
}
