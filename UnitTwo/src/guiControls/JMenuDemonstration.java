package guiControls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuDemonstration extends JFrame {
	JMenuBar bar;
	JMenu file, editJMenu;
	JMenuItem open, save, exit;
	JFileChooser fChooser;

	public JMenuDemonstration() {
		// TODO Auto-generated constructor stub
		setTitle("Menue frame");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bar = new JMenuBar(); // creating an object of JMenuBar
		file = new JMenu("File"); // creating an object of JMenu()
		file.setMnemonic('f');// alt+f

		editJMenu = new JMenu("Edit"); // adding JMenu-file to bar
		editJMenu.setMnemonic('e');// alt+e

		bar.add(file);
		bar.add(editJMenu);

		open = new JMenuItem("open", KeyEvent.VK_N);
		open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		fChooser = new JFileChooser("open");
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				fChooser.showOpenDialog(new JFrame());
			}
		});

		save = new JMenuItem("save");
		save.setEnabled(false);
		exit = new JMenuItem("exit", KeyEvent.VK_N);

		// accelator adding to exit button
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}

		});

		file.add(open);// open menuitem added to file menu
		file.add(save);
		file.add(exit);
		setJMenuBar(bar);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JMenuDemonstration();
	}

}
//event handle
//accelerator set
//mnemonic set
