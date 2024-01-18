import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.ErrorException;

public class problem69 extends GraphicsProgram {

	JTextField textField;
	JButton button;
	int lastMesY;
	ArrayList<GLabel> messages;
	private static final int X_OFFSET = 5;
	private static final int Y_OFFSET = 5;

	@Override
	public void init() {
		// init textfield
		textField = new JTextField(20);
		add(textField, SOUTH);
		// init button
		button = new JButton("Enter");
		add(button, SOUTH);

		// init messages
		lastMesY = 0;
		messages = new ArrayList<>();

		// add listeners
		textField.addActionListener(this);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String entry = textField.getText();
		GLabel newMes = new GLabel(entry);
		newMes.setFont("-40");
		lastMesY += Y_OFFSET + newMes.getAscent();
		if (lastMesY < getHeight()) {
			add(newMes, X_OFFSET, lastMesY);
			messages.add(newMes);
		} else
			shiftAllMessages(entry);
		textField.setText("");
	}

	private void shiftAllMessages(String lastMes) {
		String temp;
		for (int i = messages.size() - 1; i >= 0; i--) {
			temp = messages.get(i).getLabel();
			messages.get(i).setLabel(lastMes);
			lastMes = temp;
		}
	}

}