package layoutManager;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gridbagDemo extends JPanel {
	JButton b1, b2, b3, b4, b5;
	GridBagConstraints gbc = new GridBagConstraints();

	public gridbagDemo() {
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(5, 5, 5, 5);

		b1 = new JButton("First Button");
		// applying grid bag constraints

		gbc.gridx = 0;//column position 1
		gbc.gridy = 0;//column position 2
		gbc.gridheight = 5;//can merg 5 rows
		gbc.fill = GridBagConstraints.VERTICAL;//fill all the merge rows
		add(b1, gbc);// add buton to the 0,0 position of a layout

		b2 = new JButton("second Button");
		// applying grid bag constraints

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		add(b2, gbc);// add buton to the 0,0 position of a layout

		b3 = new JButton("third Button");
		// applying grid bag constraints

		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		add(b3, gbc);// add buton to the 0,0 position of a layout

		b4 = new JButton("fourth Button");
		// applying grid bag constraints

		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		// gbc.gridwidth = 4;
		// gbc.fill = GridBagConstraints.HORIZONTAL;
		add(b4, gbc);// add buton to the 0,0 position of a layout

		b5 = new JButton("fifth Button");
		// applying grid bag constraints

		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 4;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(b5, gbc);// add buton to the 0,0 position of a layout

	}

	public static void main(String[] args) {
		gridbagDemo panel = new gridbagDemo();
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("GridBadgeLayout");
		frame.setSize(700, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	}

}
