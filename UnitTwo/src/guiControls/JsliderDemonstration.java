package guiControls;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JsliderDemonstration extends JFrame {
	JPanel panel;
	JTextField tF;
	ChangeListener listener;

	public JsliderDemonstration() {
		setTitle("slider frame");
		setSize(400, 400);
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));

		listener = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JSlider source = (JSlider) event.getSource();
				tF.setText("Value in slider: " + source.getValue());
			}
		};

		JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 10, 100, 20);
		addslider(slider, "plain");
		panel.add(slider);
		tF = new JTextField();
		add(tF, BorderLayout.SOUTH);
		// add(panel, )
		setVisible(true);
	}

	private void addslider(JSlider slider, String type) {
		panel.add(slider);
		panel.add(new JLabel(type));
		add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new JsliderDemonstration();
	}
}
