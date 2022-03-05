package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.FlowLayout;
public class nhap extends JFrame {
	public nhap() {
		JFrame f = new JFrame("Chuong Trinh Java");
		f.setSize(300,400);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		GridLayout a = new GridLayout(4,5);
		FlowLayout b = new FlowLayout(FlowLayout.LEFT);
		
		f.setLayout(b);
		
		JButton c1 = new JButton("1");
		JButton c2 = new JButton("2");
		JButton c3 = new JButton("3");
		
		f.add(c1);
		f.add(c2);
		f.add(c3);

		
//		
//		for(int i=1; i<=16;i++) {
//			JButton a1 = new JButton(i+ "");
//			f.add(a1);
//		}
		
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new nhap();

	}
}
