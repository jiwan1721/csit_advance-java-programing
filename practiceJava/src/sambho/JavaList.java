package sambho;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import java.awt.event.*;

public class JavaList {
	JavaList() {
		JFrame frame = new JFrame();
		final JLabel label = new JLabel();// once a final variable has been assigned, it always contains the same value
		label.setSize(500, 100);
		JButton button = new JButton("dekkhau");
		button.setBounds(200, 150, 100, 50);

		final DefaultListModel<String> list1 = new DefaultListModel<>();// provides a simple implementation of a list
																		// model
		list1.addElement("c");
		list1.addElement("c++");
		list1.addElement("php");
		list1.addElement("java");

		final JList<String> lists1 = new JList<>(list1);
		lists1.setBounds(110, 110, 70, 70);

		DefaultListModel<String> list2 = new DefaultListModel<>();
		list2.addElement("project management");
		list2.addElement("dataMining");
		list2.addElement("Advance Java");
		list1.addElement("Spring");

		final JList<String> lists2 = new JList<>(list2);
		lists2.setBounds(110, 200, 70, 70);
		frame.add(lists1);
		frame.add(lists2);
		frame.add(button);
		frame.add(label);

		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dataString = "";
				if (lists1.getSelectedIndex() != -1) {
					dataString = "Programing language selected: " + lists1.getSelectedValue();
					label.setText(dataString);

				}
				if(lists2.getSelectedIndex()!=-1) {
					dataString+=",FrameWork Selected: ";
					for(Object franeObject :lists2.getSelectedValues()) {
						dataString+=franeObject+"";
						
					}
				}
				label.setText(dataString);
			}
		});
	}
	public static void main(String[] args) {
		new JavaList();
	}

}
