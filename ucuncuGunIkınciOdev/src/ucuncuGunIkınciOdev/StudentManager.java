package ucuncuGunIkınciOdev;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	private List<Student> students;

	public StudentManager() {
		students = new ArrayList<>();
	}

	public void add(Student student) {
		students.add(student);
		System.out.println(student.getFirstName() + " Eklendi");
	}
	
	public void delete(Student student) {
		
		System.out.println(student.getFirstName() + " Silindi");
	}
	
	public void update(Student student) {
		System.out.println(student.getFirstName() + " Güncellendi");
	}

	public List<Student> getAll() {

		return students;
	}
}
