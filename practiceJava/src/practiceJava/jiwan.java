package practiceJava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;


public class jiwan extends JFrame{
	//Jframe is main window Jframe is displayed above the screen
	public jiwan() {//default constructor
		setTitle("revision frame");
		setLayout(new BorderLayout(5 , 10));//by default borderlayout hunxa
		//setLayout(new FlowLayout(FlowLayout.RIGHT, 30,20));
		setSize(400, 400);
		JLabel lbLabel = new JLabel("welcome to hell");
		add(lbLabel);
		JTextField tField = new JTextField(20);
		add(tField);
		JButton btnButton = new JButton("click here");
		add(btnButton);
		add(btnButton);
		//add to jframe
		//by default hidden
		setVisible(true);
	}
	
	//JFrame frme = new JFrame();
	public static void main(String[] args) {
		new jiwan();
	}

}
