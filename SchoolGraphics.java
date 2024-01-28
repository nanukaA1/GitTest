import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SchoolGraphics extends GraphicsProgram {
	private static final int RESULT_X = 20;
	private static final int LINE_H = 20;

	private JTextField teachField;
	private JTextField subjField;
	private JTextField pupField;

	private JButton teachButton;
	private JButton subjButton;
	private JButton pupButton;
	private JButton displayPup;
	private JButton displayTeach;

	private School school;

	public void run() {
		this.resize(1000, 500);
		school = new School();

		teachField = new JTextField(10);
		add(teachField, SOUTH);

		subjField = new JTextField(10);
		add(subjField, SOUTH);

		pupField = new JTextField(10);
		add(pupField, SOUTH);

		teachButton = new JButton("Add Teach");
		add(teachButton, SOUTH);

		subjButton = new JButton("Add Subj");
		add(subjButton, SOUTH);

		pupButton = new JButton("Add Pup");
		add(pupButton, SOUTH);

		displayPup = new JButton("Display Pup");
		add(displayPup, SOUTH);

		displayTeach = new JButton("Display Teach");
		add(displayTeach, SOUTH);

		addActionListeners();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == teachButton && !teachField.getText().equals("")) {
			school.addTeacher(teachField.getText());
			clearFields();
		}
		if (e.getSource() == subjButton && !subjField.getText().equals("") && !teachField.getText().equals("")) {
			school.addSubject(teachField.getText(), subjField.getText());
			clearFields();
		}
		if (e.getSource() == pupButton && !subjField.getText().equals("") && !pupField.getText().equals("")) {
			school.addPupil(pupField.getText(), subjField.getText());
			clearFields();
		}
		if (e.getSource() == displayTeach && !pupField.getText().equals("")) {
			displayTeachers(pupField.getText());
			clearFields();
		}
		if (e.getSource() == displayPup && !teachField.getText().equals("")) {
			displayPup(pupField.getText());
			clearFields();
		}
	}

	private void displayPup(String teach) {
		removeAll();
		Iterator<String> it = school.getPupils(teach);
		if (it == null) {
			return;
		}
		double x = RESULT_X;
		double y = LINE_H;
		while (it.hasNext()) {
			String elem = it.next();
			GLabel label = new GLabel(elem);
			add(label, x, y);
			y += LINE_H;
		}
	}

	private void displayTeachers(String pup) {
		removeAll();
		Iterator<String> it = school.getTeachers(pup);
		if (it == null) {
			return;
		}
		double x = RESULT_X;
		double y = LINE_H;
		while (it.hasNext()) {
			String elem = it.next();
			GLabel label = new GLabel(elem);
			add(label, x, y);
			y += LINE_H;
		}
	}

	private void clearFields() {
		pupField.setText("");
		teachField.setText("");
		subjField.setText("");
	}
}
