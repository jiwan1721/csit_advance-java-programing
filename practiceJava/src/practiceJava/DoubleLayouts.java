//implementation of two different layouts FLowlayouts, Border layouts
package practiceJava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class DoubleLayouts extends JFrame{
	//create two different Jpanel
	//panel1-FlowLayout
	//panel2-BorderLayout
	JPanel flow_panel;
	JPanel biJPanel;
	JButton fb1, fb2, fb3;
	JButton bb1, bb2, bb3;
	public DoubleLayouts() {
		setTitle("Dual LAyout");
		setLayout(null);
		//panel one configuration
		flow_panel = new JPanel();
		flow_panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		flow_panel.setBounds(20,20,350,300);
		flow_panel.setBackground(Color.blue);
		setSize(800, 600);
		fb1= new JButton("fb1");
		fb2= new JButton("fb2");
		fb3= new JButton("fb3");
		flow_panel.add(fb1);
		flow_panel.add(fb2);
		flow_panel.add(fb3);
		add(flow_panel);
		//panel two configuration
		biJPanel = new JPanel();
		biJPanel.setLayout(new BorderLayout());
		biJPanel.setBounds(420,20,350,300);
		biJPanel.setBackground(Color.GREEN);
		bb1= new JButton("fb1");
		bb2= new JButton("fb2");
		bb3= new JButton("fb3");
		biJPanel.add(bb1,BorderLayout.NORTH);
		biJPanel.add(bb2, BorderLayout.SOUTH);
		biJPanel.add(bb3,BorderLayout.EAST);
		add(biJPanel);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new DoubleLayouts();
	}

}
