package layoutManager;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	public BorderLayoutDemo() {
		setLayout(new BorderLayout());// layout is set to JFrame
		JButton brn1 = new JButton("North");
		JButton brn2 = new JButton("south");
		JButton brn3 = new JButton("East");
		JButton brn4 = new JButton("west");
		JButton brn5 = new JButton("center");

		// adding buttos to JFrame
		add(brn1, BorderLayout.NORTH);
		add(brn2, BorderLayout.SOUTH);
		add(brn3, BorderLayout.EAST);
		add(brn4, BorderLayout.WEST);
		add(brn5, BorderLayout.CENTER);

		// configure JFrame
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
