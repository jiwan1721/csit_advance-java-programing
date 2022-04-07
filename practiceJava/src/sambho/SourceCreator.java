package sambho;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class SourceCreator extends Frame implements ActionListener {
	TextField textField;
	TextArea textArea;
	Button button;
	Label label;

	SourceCreator() {
		super("Source getter tool");
		label = new Label("Enter url");
		label.setBounds(50, 50, 50, 20);

		textField = new TextField();
		textField.setBounds(120, 50, 250, 20);
		
		button =new Button("Get Source Code");
		button.setBounds(120,100,120,30);
		button.addActionListener(this);
		
		textArea=new TextArea();
		textArea.setBounds(120,150,250,150);
		
		add(label);
		add(textArea);
		add(button);
		add(textField);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String string = textField.getText();
		if(string==null) {}
		else {
			try {
				URL u = new URL(string);
				URLConnection uc = u.openConnection();
				
				InputStream iStream = uc.getInputStream();
				int i;
				StringBuilder sBuilder = new StringBuilder();
				while ((i=iStream.read())!=-1) {
					sBuilder.append((char)i);
				}
				String sourceString=sBuilder.toString();
				textArea.setText(sourceString);
				
			}catch(Exception ex) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		new SourceCreator();
	}

}
