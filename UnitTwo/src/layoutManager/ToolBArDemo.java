package layoutManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBArDemo extends JFrame {

	JPanel panel;
	JFileChooser fChooser;
	JColorChooser colorChooser;

	public ToolBArDemo() {
		// TODO Auto-generated constructorstub
		setTitle("tool bar demo");
		setSize(400, 400);

		panel = new JPanel();
		add(panel, BorderLayout.CENTER);

		fChooser = new JFileChooser();

		colorChooser = new JColorChooser();

		Action blueAction = new AbstractAction("blue", new ImageIcon("F:\\7th sem java\\run.png")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setBackground(Color.blue);
			}
		};

		Action openAction = new AbstractAction("open", new ImageIcon("F:\\open.png")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fChooser.showSaveDialog(ToolBArDemo.this);

			}
		};
		Action close = new AbstractAction("close", new ImageIcon("f://close.png")) {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// close or terminate frame
			}
		};

		Action colorAction = new AbstractAction("color", new ImageIcon("F:\\color.png")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color pc = colorChooser.showDialog(ToolBArDemo.this, "Select Color", Color.green);
				panel.setBackground(pc);

			}
		};
		// creating a toolBar
		JToolBar bar = new JToolBar("Color Toolbar");// horizontal bby default
		bar.add(blueAction);
		bar.add(openAction);
		bar.add(close);
		bar.add(colorAction);

		add(bar, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ToolBArDemo();
	}
}
