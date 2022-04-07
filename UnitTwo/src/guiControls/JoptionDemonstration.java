package guiControls;

import javax.swing.JOptionPane;

public class JoptionDemonstration {
	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("Enter First number");
		String secondString = JOptionPane.showInputDialog("inter second number");

		int fnum = Integer.parseInt(first);
		int snum = Integer.parseInt(secondString);
		int sum = fnum + snum;
		JOptionPane.showMessageDialog(null, "the sum is: " + sum, "the sum of two integers", JOptionPane.ERROR_MESSAGE);

		JOptionPane.showConfirmDialog(null, "the sum is :" + sum, "the sum of two integers",
				JOptionPane.YES_NO_CANCEL_OPTION);

	}

}
