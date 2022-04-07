package guiControls;

import javax.swing.*;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class TextInput extends JFrame{
	JTextField tf;
	JPasswordField pfField;
	JLabel usernameJLabel;
	JLabel password;
	
	public TextInput() {
		
		
		setTitle("text input components");
		setSize(600,600);
		tf = new JTextField(10);//same as tf.setColumn(10);
		pfField = new JPasswordField();
		usernameJLabel = new JLabel("username: ",SwingConstants.RIGHT);
		password = new JLabel("password: ",SwingConstants.RIGHT);
		JPanel northpanel = new JPanel();
		northpanel.setLayout(new GridLayout(2,2));
		northpanel.add(usernameJLabel);
		northpanel.add(tf);		
		northpanel.add(password);		
		northpanel.add(pfField);
		
		add(northpanel,BorderLayout.NORTH); //panel added
		
		
		JTextArea area = new JTextArea();
		area.setRows(8);
		area.setColumns(40);
		area.setLineWrap(true);
		//we add Scrollpane in area
		JScrollPane pane = new JScrollPane(area);
		add(pane, BorderLayout.CENTER);
		
		//adding new panel
		JPanel southPanel = new JPanel();
		JButton btnButton = new JButton("Insert data");
		southPanel.add(btnButton);
		add(southPanel, BorderLayout.SOUTH);
		
		btnButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
			area.append(tf.getText()+":"+pfField.getPassword());
		}
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new TextInput();
	}

}
