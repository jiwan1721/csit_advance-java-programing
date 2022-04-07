package guiControls;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class JlisttreeTableProgressBarimplementation extends JFrame {

	JList list;
	JTree tree;
	JTable table;
	JProgressBar bar;
	JScrollPane scrollPane;

	public JlisttreeTableProgressBarimplementation() {
		setSize(400, 400);
		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

		JLabel lbl = new JLabel();
		add(lbl);
		// creating list
		String[] country = { "nepal", "india", "bhutan", "bangladesh" };
		list = new JList<String>(country);

		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				// Object item[]=list.getSelectedValue();
				lbl.setText((String) list.getSelectedValue());
			}
		});
		list.setBorder(BorderFactory.createLineBorder(Color.green));
		add(list);

		// creating tree
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode vegetable = new DefaultMutableTreeNode("vegetable");
		DefaultMutableTreeNode fruuit = new DefaultMutableTreeNode("fruit");
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("apple");
		DefaultMutableTreeNode potato = new DefaultMutableTreeNode("potato");

		root.add(vegetable);
		root.add(fruuit);
		fruuit.add(apple);
		vegetable.add(potato);
		tree = new JTree(root);
		add(tree);

		// table head
		String[] th = { "name", "adress", "college" };
		// table data
		String[][] data = { { "jiwan", "ktm", "rkm" }, { "hari", "ktm", "vedas" }, { "ram", "ltpr", "vedas" },

		};
		table = new JTable(data, th);
		scrollPane = new JScrollPane(table);
		add(scrollPane);

		// JProgressBar creation
		bar = new JProgressBar();
		JButton btn = new JButton("progress");

		btn.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				count = count + 10;
				bar.setValue(count);
				if (count >= 70) {
					bar.setString("first Division");
				}

			}
		});
		add(btn, BorderLayout.SOUTH);
		add(bar);

		setVisible(true);
	}

	public static void main(String[] args) {
		new JlisttreeTableProgressBarimplementation();
	}

}
