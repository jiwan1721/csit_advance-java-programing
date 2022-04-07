package guiControls;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class formsB extends JFrame {
	JLabel l1, l2;
	JTextField t1, t2, t3;

	public formsB() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(3, 2));
		l1 = new JLabel("int num1");
		t1 = new JTextField(10);
		add(l1);
		add(t1);
		l2 = new JLabel("intnum2");
		t2 = new JTextField(10);
		add(l2);
		add(t2);
		t3 = new JTextField(23);
		t3.setEditable(false);
		add(t3);
		t3.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				Integer num1 = Integer.parseInt(t1.getText());
				Integer num2 = Integer.parseInt(t2.getText());
				int result = num1 + num2;

				t3.setText(String.valueOf(result));
			}

		});
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new formsB();
	}

}
