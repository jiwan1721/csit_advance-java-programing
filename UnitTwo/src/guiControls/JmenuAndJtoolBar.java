package guiControls;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class JmenuAndJtoolBar extends JFrame {
	JMenuBar bar;
	JMenu file, editJMenu;
	JMenuItem open, save, exit;
	JFileChooser fChooser;

	public JmenuAndJtoolBar() {
		// TODO Auto-generated constructor stub

		setTitle("tool bar demo");
		setSize(400, 400);
		bar = new JMenuBar();
		file = new JMenu("File");
		add(bar, BorderLayout.CENTER);
		bar.add(file);

		Action blueAction = new AbstractAction("blue", new ImageIcon("F:\\7th sem java\\run.png")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bar.setBackground(Color.blue);
			}
		};
		JToolBar barA = new JToolBar("Color Toolbar");// horizontal bby default
		barA.add(blueAction);

		setJMenuBar(bar);
		add(barA, BorderLayout.NORTH);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JmenuAndJtoolBar();
	}

}
