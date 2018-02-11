package bonusuppgift_9;

/**
 * This program "Randomly" generates a 4 digit number that the user has to guess 
 * 
 * @author Anton Johansson, hj
 */

import java.awt.event.*;
import javax.swing.*;

public class FriendlyDoorLock {

	public static void main(String argv[]) {
		JFrame frame = new JFrame("Example: SpringLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(); // the "background"
		JLabel label = new JLabel("Enter PIN (4 digits):");
		JTextField text = new JTextField("", 4);
		JLabel labelafter = new JLabel("------------------------------");

		panel.add(label);
		panel.add(text);
		panel.add(labelafter);
		frame.setContentPane(panel); // connect panel to frame

		text.addActionListener(new InputHandler(text, labelafter));

		frame.pack();
		frame.setVisible(true);
	}
}

/**
 * This class implements a controller for the textfield.
 * 
 * @author Anton Johansson, hj
 */
class InputHandler implements ActionListener {
	private JTextField text;
	private int rightKey;
	private JLabel labelafter;

	public InputHandler(JTextField text, JLabel labelafter) {
		this.text = text;
		this.rightKey = (int) (Math.random() * (10000 - 1));
		this.labelafter = labelafter;
	}

	// called when the return key is depressed
	public void actionPerformed(ActionEvent arg0) {
		String temptext=text.getText();
		System.out.println(temptext); // print in console
		if (Integer.parseInt(temptext) == rightKey) {
			labelafter.setText("CORRECT");
		} else if (Integer.parseInt(temptext) < rightKey) {
			labelafter.setText("WRONG (too low)");
		} else {
			labelafter.setText("WRONG (too high)");
		}
		text.setText(""); // empty the text field
	}
}