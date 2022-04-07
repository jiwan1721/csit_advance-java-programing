package AWT;
import java.awt.*;
public class AWTDemonstration extends Frame{
	public AWTDemonstration() {
		Button btn= new Button("new Button");//button is created
		btn.setBounds(100, 201, 90, 40);//x,y[in frame],width,height
		add(btn);//adding btn into frame
		setTitle("AWT Frame");
		TextField tField = new TextField(20);
		tField.setBounds(100,150,90,40);
		add(tField);
		setSize(400,400);//size of frame//frame ko size set gareko
		setLayout(null);//without any predefined layout
		setVisible(true);//showing the Frame//hamley use gareko frame laii visible garna laii
		dispose();
	}
	public static void main(String[] args) {
		new AWTDemonstration();
		
	}

}
