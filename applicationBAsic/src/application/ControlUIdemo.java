package application;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;
import javax.swing.event.HyperlinkEvent;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.w3c.dom.Text;

public class ControlUIdemo extends application {
	@Override
	LabelUI nameLabelUI = new Label("your name");
	LabelUI nameLabelUI = new Label("your name");
	LabelUI nameLabelUI = new Label("your name");
	LabelUI nameLabelUI = new Label("your name");
	LabelUI nameLabelUI = new Label("your name");
	LabelUI nameLabelUI = new Label("your name");
	LabelUI nameLabelUI = new Label("your name");

	Text courseText = new Text("i m a student");
	Text infoText = new Text("for more visit");

	TextField nametf = new TextField();
	TextField nametf = new TextField();
	TextField nametf = new TextField();
	TextField nametf = new TextField();
	TextField nametf = new TextField();
	TextField nametf = new TextField();

	Button btn1 = new Button("submit");
	Button btn2 = new Button("clear");

	ToggleGroup group = new ToggleGroup();
	RadioButton male = new RadioBUtton("male");
	RadioButton female = new RadioBUtton("female");
	RadioButton ns = new RadioBUtton("not specifis");

	male.setToggleGroup(group);female.setToggleGroup(group);ns.setToggleGroup(group);

	CheckBox csit = new CheckBox("BSc Csit");
	CheckBox bca = new CheckBox("BCA");

	Hyperlink collegelink = new Hyperlink("https://vedascollege.edu.np");

	Tooltip tip =bca new Tooltip();ToolTipManager.setText("Click here to exit");
	Button exit =bca new Tooltip();

}
