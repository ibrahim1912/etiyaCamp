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
		System.out.println("Eklendi: " + course.getName());
	}

	public List<Course> getAll() {

		return courses;
	}
}
