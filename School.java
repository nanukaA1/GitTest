import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class School {
	private HashMap<String, HashSet<String>> teacherSubject;
	private HashMap<String, HashSet<String>> subjectStudent;
	private HashMap<String, HashSet<String>> subjectTeacher;
	private HashMap<String, HashSet<String>> studentSubject;

	public School() {
		teacherSubject = new HashMap<>();
		subjectStudent = new HashMap<>();
		subjectTeacher = new HashMap<>();
		studentSubject = new HashMap<>();
	}
	

	public void addTeacher(String teacher) {
		teacherSubject.putIfAbsent(teacher, new HashSet<>());
	}

	public void addSubject(String teacher, String subject) {
		if(!teacherSubject.containsKey(teacher)){
			return;
		}
		teacherSubject.get(teacher).add(subject);
		subjectTeacher.putIfAbsent(subject, new HashSet<>());
		subjectTeacher.get(subject).add(teacher);
	}

	public void addPupil(String pupil, String subject) {
		if(!subjectTeacher.containsKey(subject)){
			return;
		}
		studentSubject.putIfAbsent(pupil, new HashSet<>());
		studentSubject.get(pupil).add(subject);
		
		subjectStudent.putIfAbsent(subject, new HashSet<>());
		subjectStudent.get(subject).add(pupil);
		
	}

	public Iterator<String> getTeachers(String pupil) {
		if(!studentSubject.containsKey(pupil)) {
			return null;
		}
		HashSet<String> teachersForThisStudent = new HashSet<>();
		for(String subject: studentSubject.get(pupil)) {
			teachersForThisStudent.addAll(subjectTeacher.get(subject));
		}
		return teachersForThisStudent.iterator();
	}

	public Iterator<String> getPupils(String teacher) {
		if(!teacherSubject.containsKey(teacher)) {
			return null;
		}
		HashSet<String> studentsForThisTeacher = new HashSet<>();
		for(String subject: teacherSubject.get(teacher)) {
			studentsForThisTeacher.addAll(subjectStudent.get(subject));
		}
		return studentsForThisTeacher.iterator();
	}

	public void removeTeacher(String teacher) {
		
	}
}