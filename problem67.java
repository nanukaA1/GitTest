import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class problem67 extends GraphicsProgram {
	
	private JTextField textField;
	private JButton button;
	private List<GLabel> labelList;
	
	private void addLabels() {
		removeAll();
		double lastY = 0;
		for (GLabel label : labelList) {
			lastY += label.getAscent();
			add(label, 0, lastY);
		}
	}
	
	@Override
	public void init() {
		labelList = new ArrayList<GLabel>(); 
		textField = new JTextField(30);
		button = new JButton("Enter");
		add(textField, SOUTH);
		add(button, SOUTH);
		textField.addActionListener(this);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();
		if (text.isEmpty()) {
			return;
		}
		textField.setText("");
		addLabel(text);
	}
	
	private void addLabel(String text) {
		GLabel label = new GLabel(text);
		label.setFont("-30");
		double lastY = 0;
		if (!labelList.isEmpty()) {
			lastY = labelList.get(labelList.size() - 1).getY();
		}
		if (lastY + label.getAscent() > getHeight()) {
			labelList.remove(0);
		}
		labelList.add(label);
		addLabels();
	}
	

}