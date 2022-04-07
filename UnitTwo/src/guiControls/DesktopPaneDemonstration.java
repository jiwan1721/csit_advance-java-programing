package guiControls;

import java.awt.FlowLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DesktopPaneDemonstration extends JFrame {

	JDesktopPane dPane;
	JInternalFrame if1, if2, if3, if4;
	JLabel lbLabel;
	JTextField tf;

	public DesktopPaneDemonstration() {
		setSize(699, 600);
		setTitle("Desktop pane frame");
		dPane = new JDesktopPane();
		add(dPane);// dpane added to JFrame-JFrame becomes JDesktopPane
		if1 = new JInternalFrame("first IFrame", true, true, true, true);

		if1.setSize(200, 200);
		if1.setLocation(50, 50);
		lbLabel = new JLabel("username");
		tf = new JTextField(10);
		if1.add(lbLabel);
		if1.add(tf);
		if1.setLayout(new FlowLayout(FlowLayout.LEFT));
		// if1 ma layout set gareko
		if1.setVisible(true);
		dPane.add(if1);

		if2 = new JInternalFrame("second IFrame", true, true, true, true);

		if2.setSize(200, 200);
		if2.setLocation(90, 90);
		lbLabel = new JLabel("password");
		tf = new JTextField(10);
		if2.add(lbLabel);
		if2.add(tf);
		if2.setLayout(new FlowLayout(FlowLayout.LEFT));
		// if1 ma layout set gareko
		if2.setVisible(true);
		dPane.add(if2);

		if3 = new JInternalFrame("third IFrame", true, true, true, true);

		if3.setSize(200, 200);
		if3.setLocation(130, 130);
		lbLabel = new JLabel("last name");
		tf = new JTextField(10);
		if3.add(lbLabel);
		if3.add(tf);
		if3.setLayout(new FlowLayout(FlowLayout.LEFT));
		// if1 ma layout set gareko
		if3.setVisible(true);
		dPane.add(if3);

		if4 = new JInternalFrame("fourth IFrame", true, true, true, true);

		if4.setSize(200, 200);
		if4.setLocation(170, 170);
		lbLabel = new JLabel("last name");
		tf = new JTextField(10);
		if4.add(lbLabel);
		if4.add(tf);
		if4.setLayout(new FlowLayout(FlowLayout.LEFT));
		// if1 ma layout set gareko
		if4.setVisible(true);
		dPane.add(if4);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DesktopPaneDemonstration();
	}
}
