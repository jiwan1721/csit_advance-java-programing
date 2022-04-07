package swingConcept;
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class comboBoxdemo extends JFrame{
	JComboBox<String>comboBox;//generic type
	JLabel label;
	int fontsize=20;
	
	public comboBoxdemo() {
		setT("Combox frame");
		setSize(300, 300);
		label = new JLabel("Nepal is a beautiful country");
		label.setFont(new Font("serif", Font.PLAIN,fontsize));
		add(label, BorderLayout.CENTER);
		
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("Serif");
		comboBox.addItem("SansSerif");
		comboBox.addItem("Monospaced");
		comboBox.addItem("Dialog");
		comboBox.addItem("DialogInput");
		
		comboBox.addActionListener(new Action);
		
		// jpanel
		JPanel panel = new JPanel();
		panel.add(comboBox);
		add(panel, BorderLayout.SOUTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		new comboBoxdemo();
	}

}
