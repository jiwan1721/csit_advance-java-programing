package sambho;

import java.awt.BorderLayout;
import java.awt.event.*;

import java.io.File;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class FolderExplorer extends JPanel implements ActionListener {
	JTextField jTextField;
	JTextArea jTextArea;
	JTree tree;
	JButton refreshButton;
	JTable jTable;
	JScrollPane jScrollPane;
	JScrollPane jspTableJScrollPane;

	String currDirectory = null;

	final String[] colHeadStrings = { "File Name", "Size(in Bytes)", "Read Only", "hidden" };
	String[][] data = { { "", "", "", "", "" } };

	FolderExplorer(String path) {
		jTextField = new JTextField();
		jTextArea = new JTextArea();
		refreshButton = new JButton("Refresh");

		File temp = new File(path);
		DefaultMutableTreeNode top = createTree(temp);

		// if(top!=null)

		tree = new JTree(top);

		jScrollPane = new JScrollPane(tree);

		final String[] colHeadStrings = { "File Name", "Size(in Bytes)", "Read Only", "Hidden" };
		String[][] dataStrings = { { "", "", "", "", "" } };

		jTable = new JTable(data,colHeadStrings);
		jspTableJScrollPane=new JScrollPane(jTable);
		
		setLayout(new BorderLayout());
		add(jTextField,BorderLayout.NORTH);
		add(jScrollPane,BorderLayout.WEST);
		add(jspTableJScrollPane,BorderLayout.CENTER);
		add(refreshButton,BorderLayout.SOUTH);

		tree.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent me) {
				doMouseClicked(me);
			}
		
		});
		setVisible(true);
	}
	

	private DefaultMutableTreeNode createTree(File temp) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new FolderExplorer();
	}
}
