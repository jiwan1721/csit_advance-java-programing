package practceTwo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class tableProgrressBarss extends JFrame {

	JList list;
	JTree tree;
	JTable table;
	JProgressBar bar;
	JScrollPane scrollPane;

	@SuppressWarnings("unchecked")
	public tableProgrressBarss() {
		setSize(400, 600);
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Advance components");
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));

		String items[] = { "apple", "Banana", "Mango", "pineapple" };
		list = new JList(items);
		list.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		add(list);

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("vegetable");
		DefaultMutableTreeNode fruiDefaultMutableTreeNode = new DefaultMutableTreeNode("fruits");

		root.add(vegetableNode);
		root.add(fruiDefaultMutableTreeNode);
		tree = new JTree(root);
		add(tree);

		String[] cnStrings = { "title", "Artist", "Album" };
		String[][] dataStrings = { { "A1", "Aani", "x1" }, { "A2", "haren", "x2" } };
		table = new JTable(dataStrings, cnStrings);
		scrollPane = new JScrollPane(table);
		add(scrollPane);

		JButton btnButton = new JButton();
		bar = new JProgressBar();
		btnButton.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				count = count + 10;
				bar.setValue(count);
			}
		});

		add(btnButton, BorderLayout.SOUTH);
		add(bar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new tableProgrressBarss();
	}

}
