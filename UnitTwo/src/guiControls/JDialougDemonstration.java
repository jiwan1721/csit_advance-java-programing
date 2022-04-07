package guiControls;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class DialogBox extends JDialog {
	public DialogBox(JFrame frame) {
		super(frame, "im dialog", false);
		// setTitle("i m a dialog box");
		add(new JLabel("test label in Jdialog"));
		setSize(300, 300);
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		add(panel);
		setVisible(true);
	}

}

public class JDialougDemonstration extends JFrame {
	public JDialougDemonstration() {
		// TODO Auto-generated constructor stub
		setTitle("dialog Frame");
		setSize(600, 600);
		setVisible(true);
		new DialogBox(this);// constructor call of DialogBox
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JDialougDemonstration();

	}
}
