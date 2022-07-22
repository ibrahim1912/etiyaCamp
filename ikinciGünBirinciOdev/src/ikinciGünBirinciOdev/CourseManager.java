package ikinciGünBirinciOdev;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

	private List<Course> courses;

	public CourseManager() {
		courses = new ArrayList<>();
	}

	public void add(Course course) {
		courses.add(course);
		System.out.println(course.getName() + " Eklendi" );
	}
	
	public void delete(Course course) {
		
		System.out.println(course.getName() + " Silindi");
	}
	
	public void update(Course course) {
		
		System.out.println(course.getName() + " Güncellendi");
	}

	public List<Course> getAll() {

		return courses;
	}
}
