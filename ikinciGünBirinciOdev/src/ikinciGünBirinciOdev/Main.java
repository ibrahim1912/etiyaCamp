package ikinciGünBirinciOdev;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "Yazılım");
		Instructor instructor2 = new Instructor(2, "Murat", "Yücedağ", "Yazılım");
		Category category1 = new Category(1, "Programlama");

		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı", 90, instructor1, category1);
		Course course2 = new Course(4, "Programlamaya Giriş İçin Temel Kurs", 85, instructor2, category1);
	

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
	

		
		for (Course course : courseManager.getAll()) {
			System.out.println(course.getName());
			System.out.println(course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName());
			System.out.println(course.getCategory().getName());
			System.out.println("----------------------------");

		}
	}

}
