package swingConcept;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ContainersAndComponents {
	public static void main(String[] args) {
		JFrame frame=new JFrame();//frame Object
		//configuration of JFrame
		frame.setTitle("MemoryRMOp First Frame");
		frame.setBounds(0,0,900,700);//position and size of JFrame
		//frame.setSize(500,500);//width abd height
		frame.setLayout(null);//no layout,without any layout
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//trminate frame background running program
		frame.setBackground(Color.CYAN);//background color of JFrame
		frame.setVisible(true);//to make frame Visible
		
		//----components-----
		//adding apnnel to the JFrame
		JPanel panel = new JPanel();//object of panel
		panel.setLayout(null);
		panel.setBounds(100,100,300,300);//position and size of JPanel
		panel.setBackground(Color.CYAN);
		frame.add(panel);//adding pannel to Jframe
		
		//adding second panel to JFrame
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(50,50,200,200);
		panel2.setBackground(Color.blue);
		panel.add(panel2);//added panel2 to panel
		
		//adding Jbutton to panel2
		JButton button = new JButton("panel2");
		button.setBounds(50,50,100,50);
		panel2.add(button);
		
		
		
		
	}

}
