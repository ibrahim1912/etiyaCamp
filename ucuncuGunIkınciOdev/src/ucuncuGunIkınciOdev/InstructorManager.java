package ucuncuGunIkınciOdev;

import java.util.ArrayList;
import java.util.List;


public class InstructorManager {

	private List<Instructor> instructors;

	public InstructorManager() {
		instructors = new ArrayList<>();
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println(instructor.getFirstName() + " Eklendi");
	}
	
	public void delete(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " Silindi");
	}
	
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " Güncellendi");
	}

	public List<Instructor> getAll() {

		return instructors;
	}
}
