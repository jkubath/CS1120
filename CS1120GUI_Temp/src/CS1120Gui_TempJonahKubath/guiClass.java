package CS1120Gui_TempJonahKubath;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guiClass extends JFrame {
	private JPanel panel;
	private JTextField text;
	private JButton button;
	private JLabel message;
	final private int WINDOW_WIDTH = 310;
	final private int WINDOW_HEIGHT = 100;
	private boolean reBuilt = false;

	guiClass() {
		setTitle("Convert Temp");

		text = new JTextField(10);
		button = new JButton("Convert");

		button.addActionListener(new buttonListener());
		message = new JLabel("Input celcsius");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panel
		buildPanel();

		// Add the panel to the window
		add(panel);

		setVisible(true);
	}

	public void buildPanel() {
		panel = new JPanel();

		panel.add(message);
		panel.add(text);
		panel.add(button);
	}

	private class buttonListener implements ActionListener {

		// Action to be performed
		public void actionPerformed(ActionEvent e) {
			// buildPanel();

			JLabel newMessage;
			try {
				if (text.getText().length() == 0) {
					throw new emptyString();
				}

				double celc;
				celc = Double.parseDouble(text.getText());
				double fahr = (celc * 9 / 5) + 32;

				newMessage = new JLabel("Fahrenheit: " + fahr);
			} catch (emptyString empty) {
				newMessage = new JLabel("No number entered.");
			}

			// Add the result to the panel
			panel.add(newMessage);

			// Update the screen with the temp
			panel.doLayout();
		}
	}
}
