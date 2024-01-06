import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem69 extends GraphicsProgram {
	private static final int DISTANCE = 40;
	private JTextField textField;
	private JButton button;
	private double x = DISTANCE;
	private double y = DISTANCE;
	private GCompound messages;
	private double prevY;
	public void init() {
		textField = new JTextField(20);
		add(textField, SOUTH);
		
		textField.addActionListener(this);

		
		button = new JButton("Enter");
		add(button, SOUTH);
		
		
		messages = new GCompound();
		add(messages);
		addActionListeners();
		addMouseListeners();
		
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
		messages.add(message, x, y);
		y += DISTANCE;
		
		fixPositionAtLastMessage();
	}



	private void fixPositionAtLastMessage() {
		if(messages.getHeight() + DISTANCE > getHeight()) {
			double newY = getMinY(); //getHeight() - messages.getHeight() - DISTANCE;
			messages.setLocation(messages.getX(), newY);
		}
		
	}
	
	private double getMinY() {
		return getHeight() - messages.getHeight() - DISTANCE;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		prevY = e.getY();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(messages.getHeight() + DISTANCE <= getHeight()) {
			return;
		}
		messages.move(0, e.getY() - prevY);
		prevY = e.getY();
		
		double minY = getMinY();
		double maxY = 0;
		if (messages.getY() < minY) {
			messages.setLocation(messages.getX(), minY);
		}else if(messages.getY() > maxY) {
			messages.setLocation(messages.getX(), maxY);
		}
	}
	
}