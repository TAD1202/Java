package view;
import javax.swing.JButton;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.BorderLayout;

public class Vidu_BorderLayout extends JFrame {
	public Vidu_BorderLayout() {
	      JFrame f = new JFrame(" BorderLayout");
	      f.setLocationRelativeTo(null);
	      f.setSize(200,300);
	      f.setVisible(true);
	      
	      BorderLayout borderlayout = new BorderLayout(15,20);
	      f.setLayout(borderlayout);
	      JButton i1 = new JButton("1");
	      JButton i2 = new JButton("2");
	      JButton i3 = new JButton("3");
	      JButton i4 = new JButton("4");
	      JButton i5 = new JButton("5");
	      
	      f.add(i1, borderlayout.NORTH);
	      f.add(i2, borderlayout.SOUTH);
	      f.add(i3, borderlayout.WEST);
	      f.add(i4, borderlayout.EAST);
	      f.add(i5, borderlayout.CENTER);
	      
	      
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Vidu_BorderLayout();

	}

}




