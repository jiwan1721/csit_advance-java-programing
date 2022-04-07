package guiControls;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame{
	JRadioButton rb1, rb2;
	JLabel label;
	JPanel buttonJPanel;
	ButtonGroup group;
	static int fontsize = 12;
	public RadioButtonDemo(){
		setTitle("RadioButton frame");
		setSize(600,400);
		label = new JLabel("Vedas college Jawlakhel");
		label.setFont(new Font("serif", Font.PLAIN,fontsize));
		add(label, BorderLayout.CENTER);
		
		//add radio button
		buttonJPanel = new JPanel();
		group = new ButtonGroup();
		addRadiobutton("Small", 8);
		addRadiobutton("Medium", 14);
		addRadiobutton("Large", 20);
		
		add(buttonJPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void addRadiobutton(String name, int size) {
		boolean selected = size == fontsize;
		JRadioButton radio = new JRadioButton("name", selected);
		radio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			label.setFont(new Font("Serif", Font.PLAIN, size));
			}
			});
		
		group.add(radio);
		buttonJPanel.add(radio);
				
	}
	public static void main(String[] args) {
		new RadioButtonDemo();
	}

}
