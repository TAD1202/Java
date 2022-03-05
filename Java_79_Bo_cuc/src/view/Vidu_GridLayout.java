package view;

import javax.swing.JButton;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;


public class Vidu_GridLayout extends JFrame  {
	public   Vidu_GridLayout() {
		this.setTitle("Vidu SlowLayout");
		this.setSize(300,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		

		GridLayout gridlayout = new GridLayout();
		GridLayout gridlayout_1 = new GridLayout(4,4);
		GridLayout gridlayout_2 = new GridLayout(4,4);
		this.setLayout(gridlayout_2);
		
		for(int i=1; i<17;i++) {
			JButton f  = new JButton(i + " ");
             this.add(f);           
		}

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	
	}
	public static void main(String[] args) {
		new Vidu_GridLayout();
	}

}
