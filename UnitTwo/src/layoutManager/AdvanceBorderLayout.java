package layoutManager;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdvanceBorderLayout extends JFrame implements ActionListener {

	private JButton[] buttons;
	private static final String[] names = { "Hide North", "Hide South", "Hide East", "Hide west", "Hide center" };
	private BorderLayout layout;

	public AdvanceBorderLayout() {
		super("Advance Border Layout");// setTitle porperty of a JFrame
		layout = new BorderLayout(5, 5);
		setLayout(layout);
		buttons = new JButton[names.length];// array size with size of 5

		// button creation
		for (int i = 0; i < names.length; i++) {
			buttons[i] = new JButton(names[i]);// button[0] = new Jbutton("HideNOrth")
			buttons[i].addActionListener(this);

		}
		// adding buttos to JFrame
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);

		// configure Jframe
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AdvanceBorderLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (JButton button : buttons) {//JButton array foreach loop
			if(e.getSource()==button) {//clicked button source
				button.setVisible(false);//hide clicked button
			
			}else 
				button.setVisible(true);//show other button
		}
	}
}
