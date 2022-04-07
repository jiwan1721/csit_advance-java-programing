package layoutManager;

import javax.swing.*;

public class noLayoutManager extends JFrame {
  public static void main(String[] args) {
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("NoLayout Test");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	
	JLabel label = new JLabel("First Name");
	label.setBounds(20,20,100,20);
	JTextField textField = new JTextField();
	textField.setBounds(124,25,100,20);
	frame.add(label);
	frame.add(textField);
	
	JLabel label1 = new JLabel("Last Name");
	label1.setBounds(20,60,100,20);
	JTextField textField1 = new JTextField();
	textField1.setBounds(124,65,100,20);
	frame.add(label1);
	frame.add(textField1);
	
	JLabel label2 = new JLabel("Email");
	label2.setBounds(20,100,100,20);
	JTextField textField2 = new JTextField();
	textField2.setBounds(124,105,100,20);
	frame.add(label2);
	frame.add(textField2);
	
	JLabel label3 = new JLabel("phone no");
	label3.setBounds(20,140,100,20);
	JTextField textField3 = new JTextField();
	textField3.setBounds(124,145,100,20);
	frame.add(label3);
	frame.add(textField3);
	
	JLabel label4 = new JLabel("Address");
	label4.setBounds(20,180,100,20);
	JTextField textField4 = new JTextField();
	textField4.setBounds(124,185,100,20);
	frame.add(label4);
	frame.add(textField4);
	
	
	frame.setSize(500,700);
	frame.setVisible(true);
	
	JButton btn1 = new JButton("Clear");
	btn1.setBounds(124,235,80,20);
	frame.add(btn1);
	
	JButton btn2 = new JButton("Display");
	btn2.setBounds(204,235,80,20);
	frame.add(btn2);
	
	JButton btn3 = new JButton("Close");
	btn3.setBounds(284,235,80,20);
	frame.add(btn3);
}
}
