package swingConcept;



import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class BOrderDemo extends JFrame {
JPanel demopanel, buttonpanel;
ButtonGroup group;
JLabel label;

public BOrderDemo() {
setTitle("Border Frame");
setSize(400, 400);
demopanel = new JPanel();
buttonpanel = new JPanel();
buttonpanel.setBorder(BorderFactory.createEtchedBorder());
group = new ButtonGroup();
addRadiobutton("Lowered Bevel", BorderFactory.createLoweredBevelBorder());
addRadiobutton("Line Border", BorderFactory.createLineBorder(Color.RED));
addRadiobutton("Matte Border", BorderFactory.createMatteBorder(5, 5, 5, 5, Color.green));
setLayout(new GridLayout(2, 1));// 2 rows and one column
add(buttonpanel);
add(demopanel);
label = new JLabel("Borders");
demopanel.add(label);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}

private void addRadiobutton(String bname, Border border) {
JRadioButton button = new JRadioButton(bname);

button.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
demopanel.setBorder(border);
label.setText(bname);
}
});
group.add(button);
buttonpanel.add(button);
}

public static void main(String[] args) {
new BOrderDemo();
}
}
