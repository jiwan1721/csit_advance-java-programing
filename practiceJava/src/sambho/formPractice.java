package sambho;

import javax.swing.*;
import java.awt.*;

public class formPractice extends JFrame{
	JPanel panel;
	JLabel nameJLabel,addressJLabel,contactJLabel,iconlbl,dispLabel;
	JTextField nameField,addressField,contactField;
	JRadioButton Male,Female;
	JCheckBox java, web;
	JButton submitButton;
	ImageIcon icon;
	ButtonGroup group;
	
	
	
	public formPractice() {
		setTitle("practice gareko");
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GREEN);
		add(panel);
		
		nameJLabel = new JLabel("Name");
		nameJLabel.setBounds(50,50,100,20);
		panel.add(nameJLabel);
		
		nameField = new JTextField(20);
		nameField.setBounds(150, 50,200,20);
		panel.add(nameField);
		
		addressJLabel = new JLabel("address");
		addressJLabel.setBounds(50,100,150,20);
		panel.add(addressJLabel);
		
		addressField = new JTextField(20);
		addressField.setBounds(150, 100,200,20);
		panel.add(addressField);
		
		contactJLabel = new JLabel("address");
		contactJLabel.setBounds(50,150,200,20);
		panel.add(contactJLabel);
		
		contactField = new JTextField(20);
		contactField.setBounds(150, 150,250,20);
		panel.add(contactField);
		Male = new JRadioButton("Male");
		Female = new JRadioButton("Female");
		
		group = new ButtonGroup();
		group.add(Male);
		group.add(Female);
		Male.setBounds(150, 140, 200,20);
		panel.add(Male);
		Female.setBounds(150,170,200,20);
		panel.add(Female);
		
		java = new JCheckBox();
		java.setBounds(150,200,200,20);
		panel.add(java);
		
		web = new JCheckBox();
		web.setBounds(150,230,200,20);
		panel.add(web);
		
		
		
		
		submitButton = new JButton();
		submitButton.setBounds(150,50,40,20);
		panel.add(submitButton);
		
		icon = new ImageIcon("F:\\color.png");
		iconlbl = new JLabel("testlbl");
		iconlbl.setIcon(icon);
		iconlbl.setBounds(400,50,200,220);
		panel.add(iconlbl);
		
		//adding displaylbl
		dispLabel = new JLabel("display the information");
		dispLabel.setBounds(400,300,300,220);
		dispLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(dispLabel);
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new formPractice();
	}

}
