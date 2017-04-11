package gui_BasicJonahKubath;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiClass extends JFrame {
	private JPanel panel;
	private JLabel label;
	private JTextField text;
	private JButton button;
	private final int WINDOW_WIDTH = 310;
	private final int WINDOW_HEIGHT = 100;

	// Constructor
	public GuiClass() {
		setTitle("Kiometer converter");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildPanel();

		add(panel);

		setVisible(true);
	}

	public void buildPanel() {
		label = new JLabel("Enter a distance in kilometers");

		text = new JTextField(10);

		button = new JButton("Calculate");

		panel = new JPanel();

		panel.add(label);
		panel.add(text);
		panel.add(button);
	}

}
