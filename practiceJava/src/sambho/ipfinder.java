package sambho;

import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.*;



public class ipfinder extends JFrame implements ActionListener{
	JLabel I;
	JTextField tField;
	JButton button;
	
	ipfinder(){
		super("IP Finder Tool - javapoint");
		I=new JLabel("Enter Url:");
		I.setBounds(50,100,200,34);
		tField = new JTextField();
		tField.setBounds(40,150,300,54);
		
		button = new JButton("Find Ip");
		button.setBounds(50,100,100,68);
		button.addActionListener(this);
		add(I);
		add(tField);
		add(button);
		setSize(200,200);
		setLayout(null);
		setVisible(true);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String urlString=tField.getText();
		try {
			InetAddress iAddress = InetAddress.getByName(urlString);
			String ipString = iAddress.getHostAddress();
			JOptionPane.showMessageDialog(this, ipString);
			
		}catch (UnknownHostException e1) {
			JOptionPane.showMessageDialog(this, e1.toString());
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		new ipfinder();
	}

	
}
