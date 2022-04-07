package guiControls;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class checkboxDemo extends JFrame{
	JLabel label;
	JCheckBox bold;
	JCheckBox italic;
	static int fontsize = 20;
	public checkboxDemo() {//constructor
		setTitle("checkbox frame");
		setSize(600,300);
		label = new JLabel("the quick brown fox jumps over the lazy dog");
		Font lblFont = new Font("Serif",Font.PLAIN, fontsize);
		label.setFont(lblFont);
		add(label, BorderLayout.CENTER);
		
		ActionListener listener = new ActionListener() {// annonymous
			@Override
			public void actionPerformed(ActionEvent e) {
				int mode = 0;
				if(bold.isSelected()) {
					mode+=Font.BOLD;
					
					
				}
				
				if(italic.isSelected()) {
					mode+= Font.ITALIC;
				}
				label.setFont(new Font("serif",mode,fontsize));
			}
		};
		
		//adding check boxes in japanel
		JPanel checkJPanel = new JPanel();
		bold = new JCheckBox("BOLD");// object of JCheckbox
		bold.addActionListener(listener);
		italic = new JCheckBox("ITALIC");// object of JCheckbox
		italic.addActionListener(listener);
		checkJPanel.add(bold);
		checkJPanel.add(italic);
		add(checkJPanel,BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}
public static void main(String[] args) {
	new checkboxDemo();
}
}
