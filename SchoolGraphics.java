import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class SchoolGraphics extends GraphicsProgram {
	private JTextField teacherField;
	private JTextField subjectField;
	private JTextField pupilField;
	private JButton displayPupils;
	private JButton displayTeachers;
	private School school;

	public void run() {
		school = new School();
		teacherField = new JTextField(10);
		add(teacherField, SOUTH);

		subjectField = new JTextField(10);
		add(subjectField, SOUTH);

		pupilField = new JTextField(10);
		add(pupilField, SOUTH);

		displayPupils = new JButton("display pupils");
		add(displayPupils, SOUTH);

		displayTeachers = new JButton("display teachers");
		add(displayTeachers, SOUTH);
		teacherField.addActionListener(this);
		addActionListeners();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == teacherField) {
			school.addTeacher(teacherField.getText());
		}
	}
}
