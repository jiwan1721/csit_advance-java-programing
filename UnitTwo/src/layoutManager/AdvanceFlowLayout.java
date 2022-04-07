package layoutManager;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdvanceFlowLayout extends JFrame {
	private JButton leftButton;
	private JButton rightButton;
	private JButton centerButton;
	private FlowLayout layout;
	private Container container;

	public AdvanceFlowLayout() {
		// TODO Auto-generated constructor stub
		super("Advance FlowLayout");// or using setTitle("").
		layout = new FlowLayout();
		container = getContentPane();// create a panel layer above JFrame
		
		setLayout(layout);// layout is for a layer above the JFrame
		
		// Button creation or instation
		leftButton = new JButton("left");
		rightButton = new JButton("right");
		centerButton = new JButton("center");

		// button added to JFrame
		add(leftButton);// center default

		// whenever a buttion is clicked Action Listner isi generated
		leftButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.LEFT);// it aligns the layout
				layout.layoutContainer(container);// relign the layout
				container.setBackground(Color.blue);
			}
		});
		
		rightButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.RIGHT);// it aligns the layout
				layout.layoutContainer(container);// relign the layout
				container.setBackground(Color.RED);
			}
		});
		add(centerButton);// " "
		centerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.CENTER);// it aligns the layout
				layout.layoutContainer(container);// relign the layout
				container.setBackground(Color.GREEN);
			}
		});

		add(rightButton);// rightButton.added to rightButton of previous button
		

		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new AdvanceFlowLayout();
	}

}
