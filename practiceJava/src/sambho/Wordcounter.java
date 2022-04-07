package sambho;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Wordcounter extends JFrame implements ActionListener{
	JLabel lb1, lb2;
	JTextArea tArea;
	JButton button;
	JButton padButton,textButton;
	 Wordcounter(){
		super("char word count tool");
		lb1=new JLabel("characters:");
		lb1.setBounds(50,50,100,20);
		lb2=new JLabel("words");
		lb2.setBounds(50,80,100,20);
		
		tArea = new JTextArea();
		tArea.setBounds(50,110,300,200);
		
		button = new JButton("click");
		button.setBounds(50,320,80,30);
		button.addActionListener(this);
		
		padButton=new JButton("pad color");
		padButton.setBounds(140,320,110,30);
		padButton.addActionListener(this);
		
		textButton=new JButton("text color");
		textButton.setBounds(140,320,110,30);
		textButton.addActionListener(this);
		
		add(lb1);
		add(lb2);
		add(tArea);
		add(button);
		add(padButton);
		add(textButton);
		
		setSize(400,400);//sets the size of this dimension object to the specified width and height
		setLayout(null);//yo chaii hamley use gareko xainam
		setVisible(true);//makes the frame appear on the screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//the default behaviour is to simply hide the JFrame when the user closes the window
	}
	 public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==button) {
			 String textString = tArea.getText();
			 lb1.setText("characters:"+textString.length());
			 String words[]=textString.split("\\s");
			 lb2.setText("words: "+words.length);
			 
			 
		 }else if(e.getSource()==padButton) {
			 Color color = JColorChooser.showDialog(this, "Choose Color",Color.BLACK);
			 //JColorChooser provides a pane of controls designed to allow a user to manipulate and select a color
			 //JDialog control represents a top level window with a border and a title used to take some form of input from the user
			 tArea.setBackground(color);
		 }
	 }
	public static void main(String[] args) {
		new Wordcounter();
	}

}
