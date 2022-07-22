package ucuncuGunIkınciOdev;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true,
				StandardCharsets.UTF_8));

		Student student1 = new Student(1,"email","1212","İbrahim","Kaplan","Engineer",1992);
		Student student2 = new Student();
		student2.setId(2);;
		student2.setEmail("email2");
		student2.setPassword("qqw");
		student2.setFirstName("Efe");
		student2.setLastName("Berber");
		student2.setDepartment("Engineer");
		student2.setBirthYear(1999);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		
		
		for (Student student : studentManager.getAll()) {
			System.out.println(student.getFirstName() + " " + student.getLastName());
		}
		
		Instructor instructor = new Instructor(1,"email","ss","Engin","Demiroğ","112","11121");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		
		

	}

}
