package layoutManager;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class flowLayoutDemo extends JFrame{
	FlowLayout layout;//instance object
	public flowLayoutDemo() {
		//JFrame Configuration
		layout=new FlowLayout(FlowLayout.LEFT, 20, 20);
		setLayout(layout);//using flow layout for this container
		//FlowLayout arrange the components from left to right to by default
		//center aligned,and top to button
		
		//five components added
		JButton b1 = new JButton("Button1");
		JButton b2 = new JButton("Button2");
		JButton b3 = new JButton("Button3");
		JButton b4 = new JButton("Button4");
		JButton b5 = new JButton("Button5");
		
		add(b1);//first that is added in a JFrame, by default center
		add(b2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		panel.add(b3);
		panel.add(b4);
		add(b5);
		add(panel);
		//FlowLayout is default for JPanel
		//JPanel lai hami JFrame add garna sakxam tara JFrame lai Jpanel ma add garna sakdaiinam
		//JPanel light weight component ho
		//JFrame Heavy weight component ho
		
		
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		              new flowLayoutDemo();
	}

}
