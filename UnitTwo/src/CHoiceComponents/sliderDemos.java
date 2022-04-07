package CHoiceComponents;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sliderDemos extends JFrame {
	private JPanel sliderPanel;
	private JTextField textField;
	private ChangeListener listener;

	public sliderDemos() {
		setTitle("Slider test");

		sliderPanel = new JPanel();
		sliderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		listener = new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				JSlider source = (JSlider) event.getSource();
				textField.setText("" + source.getValue());

			}
		};

		// add plain slider
		JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 10, 100, 20);

		addSlider(slider, "plain");
		slider = new JSlider();
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		addSlider(slider, "Ticks");

	}

}
