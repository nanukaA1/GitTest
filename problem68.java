import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class problem68 extends GraphicsProgram {
	private static final int DISTANCE = 40;
	private JTextField textField;
	private JButton button;
	private double x = DISTANCE;
	private double y = DISTANCE;
	
	public void init() {
		textField = new JTextField(20);
		add(textField, SOUTH);
		textField.addActionListener(this);

		
		button = new JButton("Enter");
		add(button, SOUTH);
		
		
		addActionListeners();
		
	}

	public void run() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		println("here");
		if(e.getSource() == textField || e.getSource() == button) {
			String text = textField.getText();
			println(text);
			displayMessage(text);
			textField.setText("");
		}
	}
	
	private void displayMessage(String text) {
		if(text == null || text.equals("")) {
			return;
		}
		GLabel message = new GLabel(text);
		add(message, x, y);
		y += DISTANCE;
	}
}