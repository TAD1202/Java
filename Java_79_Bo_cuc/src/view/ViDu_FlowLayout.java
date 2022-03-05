package view;

import javax.swing.JButton;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class ViDu_FlowLayout extends JFrame  {
	public  ViDu_FlowLayout() {
		this.setTitle("Vidu SlowLayout");
		this.setSize(300,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		FlowLayout f_a = new FlowLayout();
		this.setLayout(f_a);
		FlowLayout f_b = new FlowLayout(FlowLayout.CENTER, 10,100);  // CENTER: can giữa
		this.setLayout(f_b);
	
		JButton f1 = new JButton("A");
		JButton f2 = new JButton("B");
		JButton f3 = new JButton("C");

		this.setVisible(true);
		this.add(f1);
		this.add(f2);
		this.add(f3);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}

}
